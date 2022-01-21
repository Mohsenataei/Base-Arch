package io.github.maa96.basearch.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import io.github.maa96.basearch.ui.base.ViewModelScope.ACTIVITY
import io.github.maa96.basearch.ui.base.ViewModelScope.FRAGMENT

abstract class BaseFragment<V : BaseViewModel, B : ViewDataBinding> :
    Fragment(),
    BaseView<V, B> {

    private var _binding: B? = null
    override val binding: B
        get() = _binding
            ?: throw IllegalStateException("access to binding should between onCreateView and onDestroyView")

    /**
     * Attempt to get viewModel lazily
     *
     * @return T an instance of requested ViewModel.
     */
    inline fun <reified T : BaseViewModel> getLazyViewModel(scope: ViewModelScope = FRAGMENT): Lazy<T> =
        when (scope) {
            ACTIVITY -> viewModels()
            FRAGMENT -> activityViewModels()
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // initialize binding
        _binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner

        // set viewModel as an observer to this activity lifecycle events
        lifecycle.addObserver(viewModel)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // observe viewModel uiActions in order to pass parent activity as argument of uiAction
        viewModel.activityAction.observe(
            viewLifecycleOwner,
            Observer {
                it.invoke(requireActivity())
            }
        )

//        viewModel.fragmentAction.observe(viewLifecycleOwner) {
//            it?.invoke(this)
//        }
        onViewInitialized(binding)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding?.unbind()
        _binding = null
    }
}
