package com.lxhmmc.baselibrary.ext

import android.view.View
import com.kotlin.base.rx.BaseException
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.lxhmmc.baselibrary.rx.BaseConsumer
import com.lxhmmc.baselibrary.rx.BaseFunc
import com.lxhmmc.baselibrary.rx.BaseFuncBoolean
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


fun <T> Observable<T>.execute(consumer: Consumer<T>, lifecycleProvider: LifecycleProvider<*>) {

    this.subscribeOn(Schedulers.io()).compose(lifecycleProvider.bindToLifecycle()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(consumer, BaseConsumer.throwable(), BaseConsumer.finish(), BaseConsumer.start())
}

fun <T> Observable<T>.executeDefulat(consumer: Consumer<T>, mView: BaseView, lifecycleProvider: LifecycleProvider<*>) {

    this.subscribeOn(Schedulers.io()).compose(lifecycleProvider.bindToLifecycle()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(consumer, Consumer<Throwable> {
                it as BaseException
                mView.onError(it.msg)
            }, BaseConsumer.finish(), BaseConsumer.start())
}


fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunc<T>())
}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}


fun View.onClick(method: () -> Unit) {
    this.setOnClickListener { method() }
}