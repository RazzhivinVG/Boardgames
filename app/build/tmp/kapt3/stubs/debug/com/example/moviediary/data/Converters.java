package com.example.moviediary.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.room.TypeConverter;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import java.io.ByteArrayOutputStream;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/moviediary/data/Converters;", "", "()V", "fromBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "toBitmap", "byteArray", "app_debug"})
public final class Converters {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final byte[] fromBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull()
    byte[] byteArray) {
        return null;
    }
    
    public Converters() {
        super();
    }
}