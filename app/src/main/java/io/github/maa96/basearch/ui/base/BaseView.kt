package io.github.maa96.basearch.ui.base

import androidx.databinding.ViewDataBinding

/**
 * Base interaction for every View such as activities, fragments, dialogs
 */
interface BaseView<V : BaseViewModel, B : ViewDataBinding> {

    /**
     * Default instance of View ViewModel, Will initialize by [viewModelFactory]
     */
    val viewModel: V

    /*
    * Resource id of main layout for view
    * */
    val layoutId: Int

    /**
     * [ViewDataBinding] child that generates for this [layoutId] by Android DataBinding framework
     */
    val binding: B

    /**
     * Will be Called after initialization of view
     * @param binding refers to [binding]
     * */
    fun onViewInitialized(binding: B) {}
}
