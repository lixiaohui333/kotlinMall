// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.presenter;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class ResetPwdPresenter_Factory implements Factory<ResetPwdPresenter> {
  private final MembersInjector<ResetPwdPresenter> resetPwdPresenterMembersInjector;

  public ResetPwdPresenter_Factory(
      MembersInjector<ResetPwdPresenter> resetPwdPresenterMembersInjector) {
    assert resetPwdPresenterMembersInjector != null;
    this.resetPwdPresenterMembersInjector = resetPwdPresenterMembersInjector;
  }

  @Override
  public ResetPwdPresenter get() {
    return MembersInjectors.injectMembers(
        resetPwdPresenterMembersInjector, new ResetPwdPresenter());
  }

  public static Factory<ResetPwdPresenter> create(
      MembersInjector<ResetPwdPresenter> resetPwdPresenterMembersInjector) {
    return new ResetPwdPresenter_Factory(resetPwdPresenterMembersInjector);
  }
}
