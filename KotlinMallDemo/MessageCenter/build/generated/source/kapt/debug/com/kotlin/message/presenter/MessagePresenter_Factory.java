// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.message.presenter;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class MessagePresenter_Factory implements Factory<MessagePresenter> {
  private final MembersInjector<MessagePresenter> messagePresenterMembersInjector;

  public MessagePresenter_Factory(
      MembersInjector<MessagePresenter> messagePresenterMembersInjector) {
    assert messagePresenterMembersInjector != null;
    this.messagePresenterMembersInjector = messagePresenterMembersInjector;
  }

  @Override
  public MessagePresenter get() {
    return MembersInjectors.injectMembers(messagePresenterMembersInjector, new MessagePresenter());
  }

  public static Factory<MessagePresenter> create(
      MembersInjector<MessagePresenter> messagePresenterMembersInjector) {
    return new MessagePresenter_Factory(messagePresenterMembersInjector);
  }
}
