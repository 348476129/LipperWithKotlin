package com.fallllllll.lipperwithkotlin.ui.main.homelist

import com.fallllllll.lipperwithkotlin.data.network.model.DribbbleModel
import com.fallllllll.lipperwithkotlin.ui.shoslist.ShotsListContract
import dagger.Module
import dagger.Provides

/**
 * Created by fall on 2017/6/19/019.
 * GitHub :  https://github.com/348476129/LipperWithKotlin
 */
@Module
class HomeListModule(private val shotsListView: ShotsListContract.ShotsListView) {
    @Provides
    fun provideShotsListPresenter(dribbbleModel: DribbbleModel): ShotsListContract.ShotsListPresenter = HomeListPresenterImpl(dribbbleModel, shotsListView)
}