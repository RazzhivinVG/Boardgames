package com.example.moviediary.ui.addeditfilm;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.hilt.Assisted;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.moviediary.data.Film;
import com.example.moviediary.data.FilmDao;
import com.example.moviediary.data.Producer;
import com.example.moviediary.data.ProducerDao;
import java.time.LocalDateTime;
import java.time.ZoneId;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001>B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0011H\u0002J\b\u00109\u001a\u00020:H\u0007J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u001bH\u0002J\u0010\u0010=\u001a\u0002072\u0006\u0010=\u001a\u00020\u0011H\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0014\u001a\u0004\u0018\u00010$@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR$\u0010-\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020201\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel;", "Landroidx/lifecycle/ViewModel;", "filmDao", "Lcom/example/moviediary/data/FilmDao;", "producerDao", "Lcom/example/moviediary/data/ProducerDao;", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/moviediary/data/FilmDao;Lcom/example/moviediary/data/ProducerDao;Landroidx/lifecycle/SavedStateHandle;)V", "addEditFilmEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent;", "getAddEditFilmEvent", "()Lkotlinx/coroutines/flow/Flow;", "addEditFilmEventChannel", "Lkotlinx/coroutines/channels/Channel;", "film", "Lcom/example/moviediary/data/Film;", "getFilm", "()Lcom/example/moviediary/data/Film;", "value", "", "filmDate", "getFilmDate", "()Ljava/lang/Object;", "setFilmDate", "(Ljava/lang/Object;)V", "", "filmGenre", "getFilmGenre", "()Ljava/lang/String;", "setFilmGenre", "(Ljava/lang/String;)V", "filmName", "getFilmName", "setFilmName", "Landroid/graphics/Bitmap;", "filmPoster", "getFilmPoster", "()Landroid/graphics/Bitmap;", "setFilmPoster", "(Landroid/graphics/Bitmap;)V", "filmRating", "getFilmRating", "setFilmRating", "filmStatus", "getFilmStatus", "setFilmStatus", "producers", "", "Lcom/example/moviediary/data/Producer;", "getProducers", "()[Lcom/example/moviediary/data/Producer;", "[Lcom/example/moviediary/data/Producer;", "createFilm", "Lkotlinx/coroutines/Job;", "newFilm", "onAddClick", "", "showInvalidInputMessage", "text", "updatedFilm", "AddEditFilmEvent", "app_debug"})
public final class AddEditFilmViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private final com.example.moviediary.data.Film film = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviediary.data.Producer[] producers = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filmName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filmGenre;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object filmDate;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap filmPoster;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filmStatus;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object filmRating;
    private final kotlinx.coroutines.channels.Channel<com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent> addEditFilmEventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent> addEditFilmEvent = null;
    private final com.example.moviediary.data.FilmDao filmDao = null;
    private final com.example.moviediary.data.ProducerDao producerDao = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.moviediary.data.Film getFilm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviediary.data.Producer[] getProducers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilmName() {
        return null;
    }
    
    public final void setFilmName(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilmGenre() {
        return null;
    }
    
    public final void setFilmGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFilmDate() {
        return null;
    }
    
    public final void setFilmDate(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getFilmPoster() {
        return null;
    }
    
    public final void setFilmPoster(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilmStatus() {
        return null;
    }
    
    public final void setFilmStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFilmRating() {
        return null;
    }
    
    public final void setFilmRating(@org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent> getAddEditFilmEvent() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void onAddClick() {
    }
    
    private final kotlinx.coroutines.Job createFilm(com.example.moviediary.data.Film newFilm) {
        return null;
    }
    
    private final kotlinx.coroutines.Job updatedFilm(com.example.moviediary.data.Film updatedFilm) {
        return null;
    }
    
    private final kotlinx.coroutines.Job showInvalidInputMessage(java.lang.String text) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public AddEditFilmViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.FilmDao filmDao, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.ProducerDao producerDao, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent;", "", "()V", "NavigateBackWithResult", "ShowInvalidInputMessage", "Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent$ShowInvalidInputMessage;", "Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent$NavigateBackWithResult;", "app_debug"})
    public static abstract class AddEditFilmEvent {
        
        private AddEditFilmEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent$ShowInvalidInputMessage;", "Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowInvalidInputMessage extends com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String msg = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMsg() {
                return null;
            }
            
            public ShowInvalidInputMessage(@org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent.ShowInvalidInputMessage copy(@org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent$NavigateBackWithResult;", "Lcom/example/moviediary/ui/addeditfilm/AddEditFilmViewModel$AddEditFilmEvent;", "result", "", "(I)V", "getResult", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class NavigateBackWithResult extends com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent {
            private final int result = 0;
            
            public final int getResult() {
                return 0;
            }
            
            public NavigateBackWithResult(int result) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.moviediary.ui.addeditfilm.AddEditFilmViewModel.AddEditFilmEvent.NavigateBackWithResult copy(int result) {
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