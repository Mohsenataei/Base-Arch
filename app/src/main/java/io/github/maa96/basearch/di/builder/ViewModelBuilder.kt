package io.github.maa96.basearch.di.builder

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import io.github.maa96.basearch.ui.base.ArchitectureViewModelFactory
import io.github.maa96.basearch.ui.home.HomeViewModelBuilder


/**
 * With this module all of ViewModels binds into generated Map<Class, ViewModel> and the map
 * will be injected in [ArchitectureViewModelFactory]. In order to do this, we have to bind all
 * ViewModelBuilder modules in this module.
 *
 * And finally [ArchitectureViewModelFactory] will be provided as [ViewModelProvider.Factory].
 *
 */

@Module(
    includes = [
        (HomeViewModelBuilder::class)
    ]
)
abstract class ViewModelBuilder {

    @Binds
    abstract fun bindViewModelFactory(archViewModelFactory: ArchitectureViewModelFactory): ViewModelProvider.Factory

}