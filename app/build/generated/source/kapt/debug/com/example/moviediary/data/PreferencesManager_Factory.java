package com.example.moviediary.data;

import android.content.Context;
import dagger.internal.Factory;
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
public final class PreferencesManager_Factory implements Factory<PreferencesManager> {
  private final Provider<Context> contextProvider;

  public PreferencesManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferencesManager get() {
    return newInstance(contextProvider.get());
  }

  public static PreferencesManager_Factory create(Provider<Context> contextProvider) {
    return new PreferencesManager_Factory(contextProvider);
  }

  public static PreferencesManager newInstance(Context context) {
    return new PreferencesManager(context);
  }
}
