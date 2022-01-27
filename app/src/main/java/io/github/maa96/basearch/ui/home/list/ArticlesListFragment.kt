package io.github.maa96.basearch.ui.home.list

import com.mohsen.architecture.R
import com.mohsen.architecture.databinding.FragmentArticlesListBinding
import io.github.maa96.basearch.ui.base.BaseFragment

class ArticlesListFragment : BaseFragment<ArticlesViewModel, FragmentArticlesListBinding>() {
    override val viewModel: ArticlesViewModel by getLazyViewModel()
    override val layoutId: Int
        get() = R.layout.fragment_articles_list
}
