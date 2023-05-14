package com.example.moviediary.di;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.example.moviediary.data.Converters;
import com.example.moviediary.data.MovieDiaryDatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import javax.inject.Qualifier;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/example/moviediary/di/AppModule;", "", "()V", "provideAppContext", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "app", "Landroid/app/Application;", "provideApplicationScope", "Lkotlinx/coroutines/CoroutineScope;", "provideDatabase", "Lcom/example/moviediary/data/MovieDiaryDatabase;", "callback", "Lcom/example/moviediary/data/MovieDiaryDatabase$Callback;", "provideFilmDao", "Lcom/example/moviediary/data/FilmDao;", "db", "provideProducerDao", "Lcom/example/moviediary/data/ProducerDao;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviediary.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.moviediary.data.MovieDiaryDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.MovieDiaryDatabase.Callback callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviediary.data.FilmDao provideFilmDao(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.MovieDiaryDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviediary.data.ProducerDao provideProducerDao(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.MovieDiaryDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    @ApplicationScope()
    public final kotlinx.coroutines.CoroutineScope provideApplicationScope() {
        return null;
    }
    
    @dagger.Provides()
    public final android.content.Context provideAppContext(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}