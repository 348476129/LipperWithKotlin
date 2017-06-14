package com.fallllllll.lipperwithkotlin

import android.os.Bundle
import android.provider.Contacts
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import com.fallllllll.lipperwithkotlin.data.local.datatank.DelegatesExt
import com.fallllllll.lipperwithkotlin.data.network.model.DribbbleModel
import com.fallllllll.lipperwithkotlin.data.network.model.impl.DribbbleModelImpl
import com.fallllllll.lipperwithkotlin.utils.LogUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import org.jetbrains.anko.UI
import org.jetbrains.anko.toast
import org.w3c.dom.Text

/**
 * Created by fallllllll on 2017/5/26/026.
 * GitHub :  https://github.com/348476129/Lipper
 */

class MainActivity : AppCompatActivity() {

    private var i by DelegatesExt.valuePreference("bbbbb", "aaa")
    //private var userId:String by DelegatesExt.preference(this,"userId","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    data class User(var name: String = "default")

}
