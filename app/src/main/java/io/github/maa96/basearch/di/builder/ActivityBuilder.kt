package io.github.maa96.basearch.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.maa96.basearch.ui.home.HomeFragmentProvider
import io.github.maa96.basearch.ui.home.HomeActivity


/**
 * The Main Module for binding all of activities.
 * Every Activity should contribute with it's related modules
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(HomeFragmentProvider::class)])
    internal abstract fun bindHomeActivity(): HomeActivity
}