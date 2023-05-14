package com.example.moviediary.ui.filmslist;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.PreferencesManager;
import com.example.moviediary.data.ProducerDao;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FilmsListViewModel_AssistedFactory implements ViewModelAssistedFactory<FilmsListViewModel> {
  private final Provider<FilmDao> filmDao;

  private final Provider<ProducerDao> producerDao;

  private final Provider<PreferencesManager> preferencesManager;

  @Inject
  FilmsListViewModel_AssistedFactory(Provider<FilmDao> filmDao, Provider<ProducerDao> producerDao,
      Provider<PreferencesManager> preferencesManager) {
    this.filmDao = filmDao;
    this.producerDao = producerDao;
    this.preferencesManager = preferencesManager;
  }

  @Override
  @NonNull
  public FilmsListViewModel create(SavedStateHandle arg0) {
    return new FilmsListViewModel(filmDao.get(), producerDao.get(), preferencesManager.get(), arg0);
  }
}
