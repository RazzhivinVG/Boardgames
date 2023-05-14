package com.example.moviediary.data;

import android.content.Context;
import android.util.Log;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/moviediary/data/PreferencesManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataStore", "Landroidx/datastore/DataStore;", "Landroidx/datastore/preferences/Preferences;", "preferencesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/moviediary/data/FilterPreferences;", "getPreferencesFlow", "()Lkotlinx/coroutines/flow/Flow;", "updateSortOrder", "", "sortOrder", "Lcom/example/moviediary/data/SortOrder;", "(Lcom/example/moviediary/data/SortOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PreferencesKeys", "app_debug"})
@javax.inject.Singleton()
public final class PreferencesManager {
    private final androidx.datastore.DataStore<androidx.datastore.preferences.Preferences> dataStore = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.moviediary.data.FilterPreferences> preferencesFlow = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.moviediary.data.FilterPreferences> getPreferencesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSortOrder(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.SortOrder sortOrder, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public PreferencesManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/moviediary/data/PreferencesManager$PreferencesKeys;", "", "()V", "SORT_ORDER", "Landroidx/datastore/preferences/Preferences$Key;", "", "getSORT_ORDER", "()Landroidx/datastore/preferences/Preferences$Key;", "app_debug"})
    static final class PreferencesKeys {
        @org.jetbrains.annotations.NotNull()
        private static final androidx.datastore.preferences.Preferences.Key<java.lang.String> SORT_ORDER = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.example.moviediary.data.PreferencesManager.PreferencesKeys INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.datastore.preferences.Preferences.Key<java.lang.String> getSORT_ORDER() {
            return null;
        }
        
        private PreferencesKeys() {
            super();
        }
    }
}