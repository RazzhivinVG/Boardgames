package com.example.moviediary.di;

import com.example.moviediary.data.MovieDiaryDatabase;
import com.example.moviediary.data.ProducerDao;
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
public final class AppModule_ProvideProducerDaoFactory implements Factory<ProducerDao> {
  private final Provider<MovieDiaryDatabase> dbProvider;

  public AppModule_ProvideProducerDaoFactory(Provider<MovieDiaryDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public ProducerDao get() {
    return provideProducerDao(dbProvider.get());
  }

  public static AppModule_ProvideProducerDaoFactory create(
      Provider<MovieDiaryDatabase> dbProvider) {
    return new AppModule_ProvideProducerDaoFactory(dbProvider);
  }

  public static ProducerDao provideProducerDao(MovieDiaryDatabase db) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideProducerDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
