package com.example.moviediary.ui.filmslist;

import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.PreferencesManager;
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
public final class FilmsListViewModel_AssistedFactory_Factory implements Factory<FilmsListViewModel_AssistedFactory> {
  private final Provider<FilmDao> filmDaoProvider;

  private final Provider<ProducerDao> producerDaoProvider;

  private final Provider<PreferencesManager> preferencesManagerProvider;

  public FilmsListViewModel_AssistedFactory_Factory(Provider<FilmDao> filmDaoProvider,
      Provider<ProducerDao> producerDaoProvider,
      Provider<PreferencesManager> preferencesManagerProvider) {
    this.filmDaoProvider = filmDaoProvider;
    this.producerDaoProvider = producerDaoProvider;
    this.preferencesManagerProvider = preferencesManagerProvider;
  }

  @Override
  public FilmsListViewModel_AssistedFactory get() {
    return newInstance(filmDaoProvider, producerDaoProvider, preferencesManagerProvider);
  }

  public static FilmsListViewModel_AssistedFactory_Factory create(Provider<FilmDao> filmDaoProvider,
      Provider<ProducerDao> producerDaoProvider,
      Provider<PreferencesManager> preferencesManagerProvider) {
    return new FilmsListViewModel_AssistedFactory_Factory(filmDaoProvider, producerDaoProvider, preferencesManagerProvider);
  }

  public static FilmsListViewModel_AssistedFactory newInstance(Provider<FilmDao> filmDao,
      Provider<ProducerDao> producerDao, Provider<PreferencesManager> preferencesManager) {
    return new FilmsListViewModel_AssistedFactory(filmDao, producerDao, preferencesManager);
  }
}
