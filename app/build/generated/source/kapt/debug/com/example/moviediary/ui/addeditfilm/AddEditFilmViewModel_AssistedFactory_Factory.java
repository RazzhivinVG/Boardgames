package com.example.moviediary.ui.addeditfilm;

import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.ProducerDao;
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
public final class AddEditFilmViewModel_AssistedFactory_Factory implements Factory<AddEditFilmViewModel_AssistedFactory> {
  private final Provider<FilmDao> filmDaoProvider;

  private final Provider<ProducerDao> producerDaoProvider;

  public AddEditFilmViewModel_AssistedFactory_Factory(Provider<FilmDao> filmDaoProvider,
      Provider<ProducerDao> producerDaoProvider) {
    this.filmDaoProvider = filmDaoProvider;
    this.producerDaoProvider = producerDaoProvider;
  }

  @Override
  public AddEditFilmViewModel_AssistedFactory get() {
    return newInstance(filmDaoProvider, producerDaoProvider);
  }

  public static AddEditFilmViewModel_AssistedFactory_Factory create(
      Provider<FilmDao> filmDaoProvider, Provider<ProducerDao> producerDaoProvider) {
    return new AddEditFilmViewModel_AssistedFactory_Factory(filmDaoProvider, producerDaoProvider);
  }

  public static AddEditFilmViewModel_AssistedFactory newInstance(Provider<FilmDao> filmDao,
      Provider<ProducerDao> producerDao) {
    return new AddEditFilmViewModel_AssistedFactory(filmDao, producerDao);
  }
}
