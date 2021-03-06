package com.lxhmmc.baselibrary.ext

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.kotlin.base.rx.BaseException
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.lxhmmc.baselibrary.rx.BaseConsumer
import com.lxhmmc.baselibrary.rx.BaseFunc
import com.lxhmmc.baselibrary.rx.BaseFuncBoolean
import com.lxhmmc.baselibrary.utils.GlideApp
import com.lxhmmc.baselibrary.widgets.DefaultTextWatcher
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


//fun <T> Observable<T>.execute(consumer: Consumer<T>, lifecycleProvider: LifecycleProvider<*>) {
//
//    this.subscribeOn(Schedulers.io()).compose(lifecycleProvider.bindToLifecycle()).observeOn(AndroidSchedulers.mainThread())
//            .subscribe(consumer, BaseConsumer.throwable(), BaseConsumer.finish(), BaseConsumer.start())
//}

fun <T> Observable<T>.executeDefulat(consumer: Consumer<T>, mView: BaseView, lifecycleProvider: LifecycleProvider<*>) {

    this.subscribeOn(Schedulers.io()).compose(lifecycleProvider.bindToLifecycle()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(consumer, Consumer<Throwable> {
                if (it is BaseException) {
                    mView.onError(it.msg)
                } else {
                    mView.onError(it.message)
                }
                mView.hideLoading()

            }, BaseConsumer.finish(mView), BaseConsumer.start(mView))
}


fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunc())
}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}


fun View.onClick(method: () -> Unit) {
    this.setOnClickListener { method() }
}

fun View.onClick(listener: View.OnClickListener): View {
    setOnClickListener(listener)
    return this
}

fun Button.enable(et: EditText, method: () -> Boolean) {
    val btn = this
    et.addTextChangedListener(object : DefaultTextWatcher() {
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            btn.isEnabled = method()
        }
    })
}

fun ImageView.loadImage(context: Context, url: String) {
    GlideApp.with(context).load(url).centerCrop().into(this)
}

fun ImageView.loadImage(url: String) {
    GlideApp.with(context).load(url).centerCrop().into(this)
}

/*
    扩展视图可见性
 */
fun View.setVisible(visible:Boolean){
    this.visibility = if (visible) View.VISIBLE else View.GONE
}
