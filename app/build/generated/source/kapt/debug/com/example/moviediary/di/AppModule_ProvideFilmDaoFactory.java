package com.example.moviediary.di;

import com.example.moviediary.data.FilmDao;
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
public final class AppModule_ProvideFilmDaoFactory implements Factory<FilmDao> {
  private final Provider<MovieDiaryDatabase> dbProvider;

  public AppModule_ProvideFilmDaoFactory(Provider<MovieDiaryDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FilmDao get() {
    return provideFilmDao(dbProvider.get());
  }

  public static AppModule_ProvideFilmDaoFactory create(Provider<MovieDiaryDatabase> dbProvider) {
    return new AppModule_ProvideFilmDaoFactory(dbProvider);
  }

  public static FilmDao provideFilmDao(MovieDiaryDatabase db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideFilmDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
