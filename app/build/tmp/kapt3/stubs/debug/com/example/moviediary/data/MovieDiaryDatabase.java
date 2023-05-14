package com.example.moviediary.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import com.example.moviediary.di.ApplicationScope;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.inject.Inject;
import javax.inject.Provider;

@androidx.room.TypeConverters(value = {com.example.moviediary.data.Converters.class})
@androidx.room.Database(entities = {com.example.moviediary.data.Film.class, com.example.moviediary.data.Producer.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/moviediary/data/MovieDiaryDatabase;", "Landroidx/room/RoomDatabase;", "()V", "filmDao", "Lcom/example/moviediary/data/FilmDao;", "producerDao", "Lcom/example/moviediary/data/ProducerDao;", "Callback", "app_debug"})
public abstract class MovieDiaryDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviediary.data.FilmDao filmDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviediary.data.ProducerDao producerDao();
    
    public MovieDiaryDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviediary/data/MovieDiaryDatabase$Callback;", "Landroidx/room/RoomDatabase$Callback;", "database", "Ljavax/inject/Provider;", "Lcom/example/moviediary/data/MovieDiaryDatabase;", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "appContext", "Landroid/content/Context;", "(Ljavax/inject/Provider;Lkotlinx/coroutines/CoroutineScope;Ljavax/inject/Provider;)V", "getBitmap", "Landroid/graphics/Bitmap;", "url", "", "context", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_debug"})
    public static final class Callback extends androidx.room.RoomDatabase.Callback {
        private final javax.inject.Provider<com.example.moviediary.data.MovieDiaryDatabase> database = null;
        private final kotlinx.coroutines.CoroutineScope applicationScope = null;
        private final javax.inject.Provider<android.content.Context> appContext = null;
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
        @java.lang.Override()
        public void onCreate(@org.jetbrains.annotations.NotNull()
        androidx.sqlite.db.SupportSQLiteDatabase db) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getBitmap(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super android.graphics.Bitmap> p2) {
            return null;
        }
        
        @javax.inject.Inject()
        public Callback(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.example.moviediary.data.MovieDiaryDatabase> database, @org.jetbrains.annotations.NotNull()
        @com.example.moviediary.di.ApplicationScope()
        kotlinx.coroutines.CoroutineScope applicationScope, @org.jetbrains.annotations.NotNull()
        javax.inject.Provider<android.content.Context> appContext) {
            super();
        }
    }
}