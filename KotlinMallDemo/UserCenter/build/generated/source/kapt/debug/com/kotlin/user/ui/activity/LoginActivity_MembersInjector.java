// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.ui.activity;

import com.kotlin.base.ui.activity.BaseMvpActivity;
import com.kotlin.user.presenter.LoginPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginPresenter> mPresenterProvider;

  public LoginActivity_MembersInjector(Provider<LoginPresenter> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<LoginActivity> create(Provider<LoginPresenter> mPresenterProvider) {
    return new LoginActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseMvpActivity) instance).mPresenter = mPresenterProvider.get();
  }
}
