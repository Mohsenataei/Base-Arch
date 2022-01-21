package io.github.maa96.basearch.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.github.maa96.basearch.ui.base.BaseViewModel
import io.github.maa96.data.model.Article
import io.github.maa96.data.repository.ArticleRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val articleRepository: ArticleRepository
) : BaseViewModel() {
    init {
        getTechCrunchNews()
    }

    private val _techCrunchNewsLiveData = MutableLiveData<List<Article>>()
    val techCrunchNewsLiveData: LiveData<List<Article>>
        get() = _techCrunchNewsLiveData

    private fun getTechCrunchNews() {
        viewModelScope.launch {
            articleRepository
                .getTechCrunchNews()
                .fold({
                    Log.d(TAG, "getTechCrunchNews: getting news failed with error: $it")
                }, {
                    _techCrunchNewsLiveData.value = it
                })
        }
    }

    companion object {
        private const val TAG = "HomeViewModel"
    }
}
