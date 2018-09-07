package com.lxhmmc.usercenter.injection.compoent

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.usercenter.injection.module.UserModule
import com.lxhmmc.usercenter.ui.activity.RegistActivity
import dagger.Component


@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(UserModule::class))
interface UserCompoent {

    fun inject(activity: RegistActivity)
}