// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.service.impl;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class OrderServiceImpl_Factory implements Factory<OrderServiceImpl> {
  private final MembersInjector<OrderServiceImpl> orderServiceImplMembersInjector;

  public OrderServiceImpl_Factory(
      MembersInjector<OrderServiceImpl> orderServiceImplMembersInjector) {
    assert orderServiceImplMembersInjector != null;
    this.orderServiceImplMembersInjector = orderServiceImplMembersInjector;
  }

  @Override
  public OrderServiceImpl get() {
    return MembersInjectors.injectMembers(orderServiceImplMembersInjector, new OrderServiceImpl());
  }

  public static Factory<OrderServiceImpl> create(
      MembersInjector<OrderServiceImpl> orderServiceImplMembersInjector) {
    return new OrderServiceImpl_Factory(orderServiceImplMembersInjector);
  }
}