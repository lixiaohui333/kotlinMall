// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.pay.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.pay.service.PayService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class PayPresenter_MembersInjector implements MembersInjector<PayPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<PayService> serviceProvider;

  public PayPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<PayService> serviceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  public static MembersInjector<PayPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<PayService> serviceProvider) {
    return new PayPresenter_MembersInjector(lifecycleProvider, contextProvider, serviceProvider);
  }

  @Override
  public void injectMembers(PayPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.service = serviceProvider.get();
  }
}
