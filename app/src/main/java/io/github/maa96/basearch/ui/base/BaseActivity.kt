package io.github.maa96.basearch.ui.base

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Every Activity should inherit this base activity in order to create relevant binding class,
 * inject dependencies and handling default actions.
 * @param V A ViewModel class that inherited from [BaseViewModel], will be used as default ViewModel of activity
 * @param B A Binding class that inherited from [ViewDataBinding], will be used for creating View of this activity
 */

abstract class BaseActivity<V : BaseViewModel, B : ViewDataBinding> :
    AppCompatActivity(),
    BaseView<V, B> {

    override lateinit var binding: B

    /**
     * @return T an instance of requested ViewModel.
     */
    inline fun <reified T : BaseViewModel> getLazyViewModel(): Lazy<T> = viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this

        lifecycle.addObserver(viewModel)

        viewModel.activityAction.observe(this, Observer { it?.invoke(this) })
        onViewInitialized(binding)
    }
}
