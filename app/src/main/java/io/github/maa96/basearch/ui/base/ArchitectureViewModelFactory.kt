package io.github.maa96.basearch.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import java.lang.RuntimeException
import javax.inject.Inject
import javax.inject.Provider


/**
 * A [ViewModelProvider.Factory] subclass that receives a map of ViewModel classes and their providers,
 * and responsible for creating and holding each ViewModel based on their classes
 *
 * @param creators a [Map] of ViewModel classes and their providers
 */
class ArchitectureViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // get the ViewModel provider based on given class
        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalArgumentException("Unknown model class $modelClass")
        try {
            return creator.get() as T
        }catch (e: Exception){
            throw RuntimeException(e)
        }
    }
}