package io.github.maa96.basearch.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import io.github.maa96.basearch.app.ArchitectureApplication
import io.github.maa96.basearch.di.builder.ActivityBuilder
import io.github.maa96.basearch.di.module.AppModule
import io.github.maa96.basearch.di.module.DatabaseModule
import io.github.maa96.basearch.di.module.NetworkModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        (NetworkModule::class),
        (AppModule::class),
        (DatabaseModule::class),
        (ActivityBuilder::class),
        (AndroidInjectionModule::class)
    ]
)
interface AppComponent : AndroidInjector<ArchitectureApplication> {

    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<ArchitectureApplication> {
        interface Factory {
            fun create(@BindsInstance application: Context): AppComponent
        }
    }

}
