package com.example.moviediary.ui.filmslist;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = FilmsListViewModel.class
)
public interface FilmsListViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.moviediary.ui.filmslist.FilmsListViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(FilmsListViewModel_AssistedFactory factory);
}
