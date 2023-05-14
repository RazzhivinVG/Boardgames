package com.example.moviediary;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.MovieDiaryDatabase;
import com.example.moviediary.data.PreferencesManager;
import com.example.moviediary.data.ProducerDao;
import com.example.moviediary.di.AppModule;
import com.example.moviediary.di.AppModule_ProvideAppContextFactory;
import com.example.moviediary.di.AppModule_ProvideApplicationScopeFactory;
import com.example.moviediary.di.AppModule_ProvideDatabaseFactory;
import com.example.moviediary.di.AppModule_ProvideFilmDaoFactory;
import com.example.moviediary.di.AppModule_ProvideProducerDaoFactory;
import com.example.moviediary.ui.MainActivity;
import com.example.moviediary.ui.addeditfilm.AddEditFilmFragment;
import com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel_AssistedFactory;
import com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel_AssistedFactory_Factory;
import com.example.moviediary.ui.filmslist.FilmsListFragment;
import com.example.moviediary.ui.filmslist.FilmsListViewModel_AssistedFactory;
import com.example.moviediary.ui.filmslist.FilmsListViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerToDoApplication_HiltComponents_SingletonC extends ToDoApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Provider<MovieDiaryDatabase> provideDatabaseProvider;

  private volatile Object applicationScopeCoroutineScope = new MemoizedSentinel();

  private volatile Provider<Context> provideAppContextProvider;

  private volatile Object movieDiaryDatabase = new MemoizedSentinel();

  private volatile Provider<FilmDao> provideFilmDaoProvider;

  private volatile Provider<ProducerDao> provideProducerDaoProvider;

  private volatile Object preferencesManager = new MemoizedSentinel();

  private volatile Provider<PreferencesManager> preferencesManagerProvider;

  private DaggerToDoApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Provider<MovieDiaryDatabase> getMovieDiaryDatabaseProvider() {
    Object local = provideDatabaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      provideDatabaseProvider = (Provider<MovieDiaryDatabase>) local;
    }
    return (Provider<MovieDiaryDatabase>) local;
  }

  private CoroutineScope getApplicationScopeCoroutineScope() {
    Object local = applicationScopeCoroutineScope;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = applicationScopeCoroutineScope;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideApplicationScopeFactory.provideApplicationScope();
          applicationScopeCoroutineScope = DoubleCheck.reentrantCheck(applicationScopeCoroutineScope, local);
        }
      }
    }
    return (CoroutineScope) local;
  }

  private Context getContext() {
    return AppModule_ProvideAppContextFactory.provideAppContext(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  private Provider<Context> getContextProvider() {
    Object local = provideAppContextProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      provideAppContextProvider = (Provider<Context>) local;
    }
    return (Provider<Context>) local;
  }

  private MovieDiaryDatabase.Callback getCallback() {
    return new MovieDiaryDatabase.Callback(getMovieDiaryDatabaseProvider(), getApplicationScopeCoroutineScope(), getContextProvider());
  }

  private MovieDiaryDatabase getMovieDiaryDatabase() {
    Object local = movieDiaryDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieDiaryDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule), getCallback());
          movieDiaryDatabase = DoubleCheck.reentrantCheck(movieDiaryDatabase, local);
        }
      }
    }
    return (MovieDiaryDatabase) local;
  }

  private FilmDao getFilmDao() {
    return AppModule_ProvideFilmDaoFactory.provideFilmDao(getMovieDiaryDatabase());
  }

  private Provider<FilmDao> getFilmDaoProvider() {
    Object local = provideFilmDaoProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideFilmDaoProvider = (Provider<FilmDao>) local;
    }
    return (Provider<FilmDao>) local;
  }

  private ProducerDao getProducerDao() {
    return AppModule_ProvideProducerDaoFactory.provideProducerDao(getMovieDiaryDatabase());
  }

  private Provider<ProducerDao> getProducerDaoProvider() {
    Object local = provideProducerDaoProvider;
    if (local == null) {
      local = new SwitchingProvider<>(3);
      provideProducerDaoProvider = (Provider<ProducerDao>) local;
    }
    return (Provider<ProducerDao>) local;
  }

  private PreferencesManager getPreferencesManager() {
    Object local = preferencesManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = preferencesManager;
        if (local instanceof MemoizedSentinel) {
          local = new PreferencesManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          preferencesManager = DoubleCheck.reentrantCheck(preferencesManager, local);
        }
      }
    }
    return (PreferencesManager) local;
  }

  private Provider<PreferencesManager> getPreferencesManagerProvider() {
    Object local = preferencesManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(4);
      preferencesManagerProvider = (Provider<PreferencesManager>) local;
    }
    return (Provider<PreferencesManager>) local;
  }

  @Override
  public void injectToDoApplication(ToDoApplication toDoApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public ToDoApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerToDoApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements ToDoApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public ToDoApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends ToDoApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements ToDoApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public ToDoApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends ToDoApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<AddEditFilmViewModel_AssistedFactory> addEditFilmViewModel_AssistedFactoryProvider;

      private volatile Provider<FilmsListViewModel_AssistedFactory> filmsListViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private AddEditFilmViewModel_AssistedFactory getAddEditFilmViewModel_AssistedFactory() {
        return AddEditFilmViewModel_AssistedFactory_Factory.newInstance(DaggerToDoApplication_HiltComponents_SingletonC.this.getFilmDaoProvider(), DaggerToDoApplication_HiltComponents_SingletonC.this.getProducerDaoProvider());
      }

      private Provider<AddEditFilmViewModel_AssistedFactory> getAddEditFilmViewModel_AssistedFactoryProvider(
          ) {
        Object local = addEditFilmViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          addEditFilmViewModel_AssistedFactoryProvider = (Provider<AddEditFilmViewModel_AssistedFactory>) local;
        }
        return (Provider<AddEditFilmViewModel_AssistedFactory>) local;
      }

      private FilmsListViewModel_AssistedFactory getFilmsListViewModel_AssistedFactory() {
        return FilmsListViewModel_AssistedFactory_Factory.newInstance(DaggerToDoApplication_HiltComponents_SingletonC.this.getFilmDaoProvider(), DaggerToDoApplication_HiltComponents_SingletonC.this.getProducerDaoProvider(), DaggerToDoApplication_HiltComponents_SingletonC.this.getPreferencesManagerProvider());
      }

      private Provider<FilmsListViewModel_AssistedFactory> getFilmsListViewModel_AssistedFactoryProvider(
          ) {
        Object local = filmsListViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          filmsListViewModel_AssistedFactoryProvider = (Provider<FilmsListViewModel_AssistedFactory>) local;
        }
        return (Provider<FilmsListViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel", (Provider) getAddEditFilmViewModel_AssistedFactoryProvider()).put("com.example.moviediary.ui.filmslist.FilmsListViewModel", (Provider) getFilmsListViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerToDoApplication_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements ToDoApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public ToDoApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends ToDoApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerToDoApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectAddEditFilmFragment(AddEditFilmFragment addEditFilmFragment) {
        }

        @Override
        public void injectFilmsListFragment(FilmsListFragment filmsListFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements ToDoApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public ToDoApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends ToDoApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements ToDoApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public ToDoApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends ToDoApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getAddEditFilmViewModel_AssistedFactory();

            case 1: // com.example.moviediary.ui.filmslist.FilmsListViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFilmsListViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements ToDoApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ToDoApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends ToDoApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.moviediary.data.FilmDao 
        return (T) DaggerToDoApplication_HiltComponents_SingletonC.this.getFilmDao();

        case 1: // com.example.moviediary.data.MovieDiaryDatabase 
        return (T) DaggerToDoApplication_HiltComponents_SingletonC.this.getMovieDiaryDatabase();

        case 2: // android.content.Context 
        return (T) DaggerToDoApplication_HiltComponents_SingletonC.this.getContext();

        case 3: // com.example.moviediary.data.ProducerDao 
        return (T) DaggerToDoApplication_HiltComponents_SingletonC.this.getProducerDao();

        case 4: // com.example.moviediary.data.PreferencesManager 
        return (T) DaggerToDoApplication_HiltComponents_SingletonC.this.getPreferencesManager();

        default: throw new AssertionError(id);
      }
    }
  }
}
