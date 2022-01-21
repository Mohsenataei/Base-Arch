package io.github.maa96.basearch.ui.home

import android.util.Log
import com.mohsen.architecture.R
import com.mohsen.architecture.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import io.github.maa96.basearch.ui.base.BaseActivity

@AndroidEntryPoint
class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>() {

    override fun onViewInitialized(binding: ActivityHomeBinding) {
        super.onViewInitialized(binding)
        viewModel.techCrunchNewsLiveData.observe(this) {
            Log.d(TAG, "onViewInitialized: ${it.size}")
        }
    }
    override val viewModel: HomeViewModel by getLazyViewModel()
    override val layoutId: Int
        get() = R.layout.activity_home

    companion object {
        private const val TAG = "HomeActivity"
    }
}
