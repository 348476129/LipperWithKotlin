package com.fallllllll.lipperwithkotlin.ui.main.homelist

import com.fallllllll.lipperwithkotlin.BuildConfig
import com.fallllllll.lipperwithkotlin.core.MyRobolectricTestRunner
import com.fallllllll.lipperwithkotlin.data.network.model.DribbbleModel
import com.fallllllll.lipperwithkotlin.utils.mock
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.`when`
import org.robolectric.annotation.Config
import org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment

/**
 * Created by fallllllll on 2017/6/22/022.
 * GitHub :  https://github.com/348476129/Lipper
 */
@RunWith(MyRobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class ShotsListFragmentTest {

    val presenter = mock<AbstractShotListPresenter>()

    @Test
    fun textShotsListFragment() {
        val shotsListFragment = ShotsListFragment()
        val mockShotsListModule = mock<ShotsListModule>()
        `when`(mockShotsListModule.provideShotsListPresenter(any<DribbbleModel>())).thenReturn(presenter)
        shotsListFragment.shotsListModule=mockShotsListModule
        startFragment(shotsListFragment)
        verify(presenter).attach()
        verify(presenter).onPresenterCreate()
    }
}