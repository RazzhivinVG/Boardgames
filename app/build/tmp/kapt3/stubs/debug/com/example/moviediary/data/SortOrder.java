package com.example.moviediary.data;

import android.content.Context;
import android.util.Log;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviediary/data/SortOrder;", "", "(Ljava/lang/String;I)V", "BY_NAME", "BY_YEAR", "BY_GENRE", "BY_PRODUCER", "app_debug"})
public enum SortOrder {
    /*public static final*/ BY_NAME /* = new BY_NAME() */,
    /*public static final*/ BY_YEAR /* = new BY_YEAR() */,
    /*public static final*/ BY_GENRE /* = new BY_GENRE() */,
    /*public static final*/ BY_PRODUCER /* = new BY_PRODUCER() */;
    
    SortOrder() {
    }
}