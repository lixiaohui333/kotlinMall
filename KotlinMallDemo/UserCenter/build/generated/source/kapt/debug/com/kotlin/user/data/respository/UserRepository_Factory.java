// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.data.respository;

import dagger.internal.Factory;

public final class UserRepository_Factory implements Factory<UserRepository> {
  private static final UserRepository_Factory INSTANCE = new UserRepository_Factory();

  @Override
  public UserRepository get() {
    return new UserRepository();
  }

  public static Factory<UserRepository> create() {
    return INSTANCE;
  }
}
