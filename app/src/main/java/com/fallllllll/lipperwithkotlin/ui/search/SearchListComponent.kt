package com.fallllllll.lipperwithkotlin.ui.search

import com.fallllllll.lipperwithkotlin.core.dagger.AppComponent
import com.fallllllll.lipperwithkotlin.general_presenter.LikeAndUnlikePresenter.LikeAndUnlikeModule
import com.fallllllll.lipperwithkotlin.general_presenter.shot_likes_presenter.ShotLikesModule
import com.fallllllll.lipperwithkotlin.ui.shoslist.ShotsListFragment
import dagger.Component

/**
 * Created by fall on 2017/7/6/006.
 * GitHub :  https://github.com/348476129/LipperWithKotlin
 */
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(SearchListModule::class,ShotLikesModule::class,LikeAndUnlikeModule::class))
interface SearchListComponent {
    fun inject(shotsListFragment: ShotsListFragment)
}