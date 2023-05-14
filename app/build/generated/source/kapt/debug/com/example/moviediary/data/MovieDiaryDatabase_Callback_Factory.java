package com.example.moviediary.data;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieDiaryDatabase_Callback_Factory implements Factory<MovieDiaryDatabase.Callback> {
  private final Provider<MovieDiaryDatabase> databaseProvider;

  private final Provider<CoroutineScope> applicationScopeProvider;

  private final Provider<Context> appContextProvider;

  public MovieDiaryDatabase_Callback_Factory(Provider<MovieDiaryDatabase> databaseProvider,
      Provider<CoroutineScope> applicationScopeProvider, Provider<Context> appContextProvider) {
    this.databaseProvider = databaseProvider;
    this.applicationScopeProvider = applicationScopeProvider;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public MovieDiaryDatabase.Callback get() {
    return newInstance(databaseProvider, applicationScopeProvider.get(), appContextProvider);
  }

  public static MovieDiaryDatabase_Callback_Factory create(
      Provider<MovieDiaryDatabase> databaseProvider,
      Provider<CoroutineScope> applicationScopeProvider, Provider<Context> appContextProvider) {
    return new MovieDiaryDatabase_Callback_Factory(databaseProvider, applicationScopeProvider, appContextProvider);
  }

  public static MovieDiaryDatabase.Callback newInstance(Provider<MovieDiaryDatabase> database,
      CoroutineScope applicationScope, Provider<Context> appContext) {
    return new MovieDiaryDatabase.Callback(database, applicationScope, appContext);
  }
}
