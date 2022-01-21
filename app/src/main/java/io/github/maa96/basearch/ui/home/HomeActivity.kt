package io.github.maa96.basearch.ui.home

import android.os.Bundle
import com.mohsen.architecture.R
import com.mohsen.architecture.databinding.ActivityHomeBinding
import io.github.maa96.basearch.ui.base.BaseActivity

class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override val viewModel: HomeViewModel by getLazyViewModel()

    override val layoutId: Int
        get() = R.layout.activity_home
}