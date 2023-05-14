package com.example.moviediary.di;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAppContextFactory implements Factory<Context> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideAppContextFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideAppContext(appProvider.get());
  }

  public static AppModule_ProvideAppContextFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideAppContextFactory(appProvider);
  }

  public static Context provideAppContext(Application app) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideAppContext(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
