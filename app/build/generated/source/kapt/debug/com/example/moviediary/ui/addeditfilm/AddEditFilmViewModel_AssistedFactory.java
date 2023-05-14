package com.example.moviediary.ui.addeditfilm;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.ProducerDao;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddEditFilmViewModel_AssistedFactory implements ViewModelAssistedFactory<AddEditFilmViewModel> {
  private final Provider<FilmDao> filmDao;

  private final Provider<ProducerDao> producerDao;

  @Inject
  AddEditFilmViewModel_AssistedFactory(Provider<FilmDao> filmDao,
      Provider<ProducerDao> producerDao) {
    this.filmDao = filmDao;
    this.producerDao = producerDao;
  }

  @Override
  @NonNull
  public AddEditFilmViewModel create(SavedStateHandle arg0) {
    return new AddEditFilmViewModel(filmDao.get(), producerDao.get(), arg0);
  }
}
