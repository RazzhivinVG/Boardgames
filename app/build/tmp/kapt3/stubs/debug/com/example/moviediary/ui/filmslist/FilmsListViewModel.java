package com.example.moviediary.ui.filmslist;

import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import com.example.moviediary.data.*;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00010B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u000fJ!\u0010(\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100*\u00a2\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u000fR/\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListViewModel;", "Landroidx/lifecycle/ViewModel;", "filmDao", "Lcom/example/moviediary/data/FilmDao;", "producerDao", "Lcom/example/moviediary/data/ProducerDao;", "preferencesManager", "Lcom/example/moviediary/data/PreferencesManager;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/moviediary/data/FilmDao;Lcom/example/moviediary/data/ProducerDao;Lcom/example/moviediary/data/PreferencesManager;Landroidx/lifecycle/SavedStateHandle;)V", "allList", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "Lcom/example/moviediary/data/Film;", "Lcom/example/moviediary/data/Producer;", "getAllList", "()Landroidx/lifecycle/LiveData;", "filmsList", "Lkotlinx/coroutines/flow/Flow;", "filmsListEvent", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent;", "getFilmsListEvent", "()Lkotlinx/coroutines/flow/Flow;", "filmslistEventChannel", "Lkotlinx/coroutines/channels/Channel;", "preferencesFlow", "Lcom/example/moviediary/data/FilterPreferences;", "getPreferencesFlow", "searchQuery", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "onAddNewFilmClick", "Lkotlinx/coroutines/Job;", "onFilmItemSwiped", "film", "onFilmSelected", "producers", "", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)Lkotlinx/coroutines/Job;", "onSortOrderSelected", "sortOrder", "Lcom/example/moviediary/data/SortOrder;", "onUndoDeleteClick", "FilmsListEvent", "app_debug"})
public final class FilmsListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.moviediary.data.FilterPreferences> preferencesFlow = null;
    private final kotlinx.coroutines.channels.Channel<com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent> filmslistEventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent> filmsListEvent = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> filmsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<com.example.moviediary.data.Film>, java.util.List<com.example.moviediary.data.Producer>>> allList = null;
    private final com.example.moviediary.data.FilmDao filmDao = null;
    private final com.example.moviediary.data.ProducerDao producerDao = null;
    private final com.example.moviediary.data.PreferencesManager preferencesManager = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.moviediary.data.FilterPreferences> getPreferencesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent> getFilmsListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.util.List<com.example.moviediary.data.Film>, java.util.List<com.example.moviediary.data.Producer>>> getAllList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onSortOrderSelected(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.SortOrder sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onFilmSelected(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Producer[] producers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onFilmItemSwiped(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onUndoDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onAddNewFilmClick() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FilmsListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.FilmDao filmDao, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.ProducerDao producerDao, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.PreferencesManager preferencesManager, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent;", "", "()V", "NavigateToAddFilmScreen", "NavigateToEditFilmScreen", "ShowUndoDeleteNoteMessage", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$NavigateToAddFilmScreen;", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$ShowUndoDeleteNoteMessage;", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$NavigateToEditFilmScreen;", "app_debug"})
    public static abstract class FilmsListEvent {
        
        private FilmsListEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$NavigateToAddFilmScreen;", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent;", "()V", "app_debug"})
        public static final class NavigateToAddFilmScreen extends com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent.NavigateToAddFilmScreen INSTANCE = null;
            
            private NavigateToAddFilmScreen() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$ShowUndoDeleteNoteMessage;", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent;", "film", "Lcom/example/moviediary/data/Film;", "(Lcom/example/moviediary/data/Film;)V", "getFilm", "()Lcom/example/moviediary/data/Film;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowUndoDeleteNoteMessage extends com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.example.moviediary.data.Film film = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Film getFilm() {
                return null;
            }
            
            public ShowUndoDeleteNoteMessage(@org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Film film) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Film component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent.ShowUndoDeleteNoteMessage copy(@org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Film film) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$NavigateToEditFilmScreen;", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent;", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)V", "getFilm", "()Lcom/example/moviediary/data/Film;", "getProducers", "()[Lcom/example/moviediary/data/Producer;", "[Lcom/example/moviediary/data/Producer;", "component1", "component2", "copy", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)Lcom/example/moviediary/ui/filmslist/FilmsListViewModel$FilmsListEvent$NavigateToEditFilmScreen;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class NavigateToEditFilmScreen extends com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.example.moviediary.data.Film film = null;
            @org.jetbrains.annotations.NotNull()
            private final com.example.moviediary.data.Producer[] producers = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Film getFilm() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Producer[] getProducers() {
                return null;
            }
            
            public NavigateToEditFilmScreen(@org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Producer[] producers) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Film component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.data.Producer[] component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.ui.filmslist.FilmsListViewModel.FilmsListEvent.NavigateToEditFilmScreen copy(@org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
            com.example.moviediary.data.Producer[] producers) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}