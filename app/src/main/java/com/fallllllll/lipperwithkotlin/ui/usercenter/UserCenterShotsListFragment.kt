package com.fallllllll.lipperwithkotlin.ui.usercenter

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.fall.generalrecyclerviewfragment.GeneralContract
import com.fallllllll.AppApplication
import com.fallllllll.lipperwithkotlin.core.expandFunction.dpToPx
import com.fallllllll.lipperwithkotlin.core.expandFunction.getNavigationBarHeight
import com.fallllllll.lipperwithkotlin.core.fragment.BaseListFragment
import com.fallllllll.lipperwithkotlin.core.presenter.Contract
import javax.inject.Inject

/**
 * Created by qqq34 on 2017/10/16.
 */
class UserCenterShotsListFragment:BaseListFragment() {
    private val listAdapter by lazy { UserCenterShotsListAdapter() }

    @Inject
     lateinit var userCenterShotsListPresenter:GeneralContract.Presenter

    override fun getAdapter()=listAdapter
    override fun getLayoutManager()=GridLayoutManager(context,2)
    override fun getPresenter()=userCenterShotsListPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerUserShotsListComponent
                .builder()
                .appComponent(AppApplication.instance.appComponent)
                .userShotsListModule(UserShotsListModule())
                .build()
                .inject(this)
presenterLifecycleHelper.addPresenter(userCenterShotsListPresenter as Contract.Presenter)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.clipToPadding=false
        val padding = activity?.dpToPx(12)?.toInt()?:0
        recyclerView.setPadding(padding,padding,padding,activity?.getNavigationBarHeight()?:0)
    }

    override fun initListeners() {
        super.initListeners()
        adapter.itemClick={
            showToast("点击了${it.id}")
        }
    }
}