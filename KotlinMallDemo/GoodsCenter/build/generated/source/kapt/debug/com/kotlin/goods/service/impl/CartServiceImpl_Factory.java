// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.goods.service.impl;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class CartServiceImpl_Factory implements Factory<CartServiceImpl> {
  private final MembersInjector<CartServiceImpl> cartServiceImplMembersInjector;

  public CartServiceImpl_Factory(MembersInjector<CartServiceImpl> cartServiceImplMembersInjector) {
    assert cartServiceImplMembersInjector != null;
    this.cartServiceImplMembersInjector = cartServiceImplMembersInjector;
  }

  @Override
  public CartServiceImpl get() {
    return MembersInjectors.injectMembers(cartServiceImplMembersInjector, new CartServiceImpl());
  }

  public static Factory<CartServiceImpl> create(
      MembersInjector<CartServiceImpl> cartServiceImplMembersInjector) {
    return new CartServiceImpl_Factory(cartServiceImplMembersInjector);
  }
}
