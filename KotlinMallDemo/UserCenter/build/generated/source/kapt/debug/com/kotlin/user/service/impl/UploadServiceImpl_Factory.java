// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.service.impl;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;

public final class UploadServiceImpl_Factory implements Factory<UploadServiceImpl> {
  private final MembersInjector<UploadServiceImpl> uploadServiceImplMembersInjector;

  public UploadServiceImpl_Factory(
      MembersInjector<UploadServiceImpl> uploadServiceImplMembersInjector) {
    assert uploadServiceImplMembersInjector != null;
    this.uploadServiceImplMembersInjector = uploadServiceImplMembersInjector;
  }

  @Override
  public UploadServiceImpl get() {
    return MembersInjectors.injectMembers(
        uploadServiceImplMembersInjector, new UploadServiceImpl());
  }

  public static Factory<UploadServiceImpl> create(
      MembersInjector<UploadServiceImpl> uploadServiceImplMembersInjector) {
    return new UploadServiceImpl_Factory(uploadServiceImplMembersInjector);
  }
}
