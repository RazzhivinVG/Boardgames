package com.example.moviediary.ui.filmslist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavDirections;
import com.example.moviediary.R;
import com.example.moviediary.data.Film;
import com.example.moviediary.data.Producer;
import java.io.Serializable;
import kotlin.Array;
import kotlin.Int;
import kotlin.String;
import kotlin.Suppress;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListFragmentDirections;", "", "()V", "ActionFilmsListFragmentToAddEditFilmFragment", "Companion", "app_debug"})
public final class FilmsListFragmentDirections {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviediary.ui.filmslist.FilmsListFragmentDirections.Companion Companion = null;
    
    private FilmsListFragmentDirections() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J6\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListFragmentDirections$ActionFilmsListFragmentToAddEditFilmFragment;", "Landroidx/navigation/NavDirections;", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "fragmentTitle", "", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;Ljava/lang/String;)V", "getFilm", "()Lcom/example/moviediary/data/Film;", "getFragmentTitle", "()Ljava/lang/String;", "getProducers", "()[Lcom/example/moviediary/data/Producer;", "[Lcom/example/moviediary/data/Producer;", "component1", "component2", "component3", "copy", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;Ljava/lang/String;)Lcom/example/moviediary/ui/filmslist/FilmsListFragmentDirections$ActionFilmsListFragmentToAddEditFilmFragment;", "equals", "", "other", "", "getActionId", "", "getArguments", "Landroid/os/Bundle;", "hashCode", "toString", "app_debug"})
    static final class ActionFilmsListFragmentToAddEditFilmFragment implements androidx.navigation.NavDirections {
        @org.jetbrains.annotations.Nullable()
        private final com.example.moviediary.data.Film film = null;
        @org.jetbrains.annotations.Nullable()
        private final com.example.moviediary.data.Producer[] producers = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fragmentTitle = null;
        
        @java.lang.Override()
        public int getActionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
        @java.lang.Override()
        public android.os.Bundle getArguments() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.moviediary.data.Film getFilm() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.moviediary.data.Producer[] getProducers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFragmentTitle() {
            return null;
        }
        
        public ActionFilmsListFragmentToAddEditFilmFragment(@org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Film film, @org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Producer[] producers, @org.jetbrains.annotations.NotNull()
        java.lang.String fragmentTitle) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.moviediary.data.Film component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.moviediary.data.Producer[] component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviediary.ui.filmslist.FilmsListFragmentDirections.ActionFilmsListFragmentToAddEditFilmFragment copy(@org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Film film, @org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Producer[] producers, @org.jetbrains.annotations.NotNull()
        java.lang.String fragmentTitle) {
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
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListFragmentDirections$Companion;", "", "()V", "actionFilmsListFragmentToAddEditFilmFragment", "Landroidx/navigation/NavDirections;", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "fragmentTitle", "", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;Ljava/lang/String;)Landroidx/navigation/NavDirections;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.navigation.NavDirections actionFilmsListFragmentToAddEditFilmFragment(@org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Film film, @org.jetbrains.annotations.Nullable()
        com.example.moviediary.data.Producer[] producers, @org.jetbrains.annotations.NotNull()
        java.lang.String fragmentTitle) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}