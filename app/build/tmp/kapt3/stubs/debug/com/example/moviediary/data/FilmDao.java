package com.example.moviediary.data;

import android.provider.ContactsContract;
import androidx.room.*;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviediary/data/FilmDao;", "", "delete", "", "film", "Lcom/example/moviediary/data/Film;", "(Lcom/example/moviediary/data/Film;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilmsList", "Lkotlinx/coroutines/flow/Flow;", "", "searchQuery", "", "sortOrder", "Lcom/example/moviediary/data/SortOrder;", "getFilmsListByGenre", "getFilmsListByName", "getFilmsListByProducer", "getFilmsListByYear", "insert", "update", "app_debug"})
public abstract interface FilmDao {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.SortOrder sortOrder);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM films WHERE name LIKE \'%\' || :searchQuery || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsListByName(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM films WHERE strftime(\'%Y\', year_of_issue) LIKE \'%\' || :searchQuery || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsListByYear(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM films WHERE genre LIKE \'%\' || :searchQuery || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsListByGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM films WHERE id IN (SELECT film_id FROM producers WHERE name LIKE \'%\' || :searchQuery || \'%\' )")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsListByProducer(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static kotlinx.coroutines.flow.Flow<java.util.List<com.example.moviediary.data.Film>> getFilmsList(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.FilmDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.SortOrder sortOrder) {
            return null;
        }
    }
}