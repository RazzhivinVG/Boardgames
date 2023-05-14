package com.example.moviediary.di;

import android.app.Application;
import com.example.moviediary.data.MovieDiaryDatabase;
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
public final class AppModule_ProvideDatabaseFactory implements Factory<MovieDiaryDatabase> {
  private final Provider<Application> appProvider;

  private final Provider<MovieDiaryDatabase.Callback> callbackProvider;

  public AppModule_ProvideDatabaseFactory(Provider<Application> appProvider,
      Provider<MovieDiaryDatabase.Callback> callbackProvider) {
    this.appProvider = appProvider;
    this.callbackProvider = callbackProvider;
  }

  @Override
  public MovieDiaryDatabase get() {
    return provideDatabase(appProvider.get(), callbackProvider.get());
  }

  public static AppModule_ProvideDatabaseFactory create(Provider<Application> appProvider,
      Provider<MovieDiaryDatabase.Callback> callbackProvider) {
    return new AppModule_ProvideDatabaseFactory(appProvider, callbackProvider);
  }

  public static MovieDiaryDatabase provideDatabase(Application app,
      MovieDiaryDatabase.Callback callback) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideDatabase(app, callback), "Cannot return null from a non-@Nullable @Provides method");
  }
}
