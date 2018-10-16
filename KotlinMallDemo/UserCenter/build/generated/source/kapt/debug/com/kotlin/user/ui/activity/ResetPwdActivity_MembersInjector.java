// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.ui.activity;

import com.kotlin.base.ui.activity.BaseMvpActivity;
import com.kotlin.user.presenter.ResetPwdPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class ResetPwdActivity_MembersInjector implements MembersInjector<ResetPwdActivity> {
  private final Provider<ResetPwdPresenter> mPresenterProvider;

  public ResetPwdActivity_MembersInjector(Provider<ResetPwdPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<ResetPwdActivity> create(
      Provider<ResetPwdPresenter> mPresenterProvider) {
    return new ResetPwdActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(ResetPwdActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseMvpActivity) instance).mPresenter = mPresenterProvider.get();
  }
}