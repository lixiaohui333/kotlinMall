// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.order.service.ShipAddressService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class EditShipAddressPresenter_MembersInjector
    implements MembersInjector<EditShipAddressPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<ShipAddressService> shipAddressServiceProvider;

  public EditShipAddressPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<ShipAddressService> shipAddressServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert shipAddressServiceProvider != null;
    this.shipAddressServiceProvider = shipAddressServiceProvider;
  }

  public static MembersInjector<EditShipAddressPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<ShipAddressService> shipAddressServiceProvider) {
    return new EditShipAddressPresenter_MembersInjector(
        lifecycleProvider, contextProvider, shipAddressServiceProvider);
  }

  @Override
  public void injectMembers(EditShipAddressPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.shipAddressService = shipAddressServiceProvider.get();
  }
}
