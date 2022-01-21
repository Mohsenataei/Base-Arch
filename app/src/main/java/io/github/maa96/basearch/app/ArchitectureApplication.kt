package io.github.maa96.basearch.app

import com.facebook.stetho.Stetho
import com.mohsen.architecture.BuildConfig
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.maa96.basearch.di.component.DaggerAppComponent

class ArchitectureApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.factory().create(this)


    private fun initDebugModeValues() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
}