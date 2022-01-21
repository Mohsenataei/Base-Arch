package io.github.maa96.data.di.qualifier

import javax.inject.Qualifier

/**
 * A qualifier to identify without-token api services
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class WithoutToken
