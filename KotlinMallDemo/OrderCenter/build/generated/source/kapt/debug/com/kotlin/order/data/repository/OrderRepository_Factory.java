// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.data.repository;

import dagger.internal.Factory;

public final class OrderRepository_Factory implements Factory<OrderRepository> {
  private static final OrderRepository_Factory INSTANCE = new OrderRepository_Factory();

  @Override
  public OrderRepository get() {
    return new OrderRepository();
  }

  public static Factory<OrderRepository> create() {
    return INSTANCE;
  }
}
