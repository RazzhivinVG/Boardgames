package com.example.moviediary.data

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import coil.ImageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.example.moviediary.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Film::class, Producer::class], version = 1)
@TypeConverters(Converters::class)
abstract class MovieDiaryDatabase : RoomDatabase() {

    abstract fun filmDao(): FilmDao
    abstract fun producerDao(): ProducerDao

    class Callback @Inject constructor(
        private val database: Provider<MovieDiaryDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope,
        private val appContext: Provider<Context>
    ) : RoomDatabase.Callback() {

        @RequiresApi(Build.VERSION_CODES.O)
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val filmDao = database.get().filmDao()
            val producerDao = database.get().producerDao()
            val context = appContext.get()

            applicationScope.launch {
                filmDao.insert(Film(
                    name = "Побег из Шоушенка",
                    genre = "dramm",
                    year_of_issue = LocalDateTime.of(1994, 9, 10, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    poster = getBitmap("https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/0b76b2a2-d1c7-4f04-a284-80ff7bb709a4/300x450", context),
                    status = "просмотрено",
                    rating = 10
                ))
                filmDao.insert(Film(
                    name = "Зеленая миля",
                    genre = "фэнтези, dramm, криминал, детектив",
                    year_of_issue = LocalDateTime.of(1999, 12, 6, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    poster = getBitmap("https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/4057c4b8-8208-4a04-b169-26b0661453e3/300x450", context),
                    status = "буду смотреть",
                    rating = 0
                ))
                filmDao.insert(Film(
                    name = "Властелин колец: Возвращение Короля",
                    genre = "фэнтези, приключения, dramm",
                    year_of_issue = LocalDateTime.of(2003, 12, 1, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    poster = getBitmap("https://avatars.mds.yandex.net/get-kinopoisk-image/1900788/fbe4afb6-e190-48f3-9ac1-4de9a1029481/300x450", context),
                    status = "просмотрено",
                    rating = 9
                ))
                filmDao.insert(Film(
                    name = "Интерстеллар",
                    genre = "фантастика, драма, приключения",
                    year_of_issue = LocalDateTime.of(2014, 10, 26, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    poster = getBitmap("https://avatars.mds.yandex.net/get-kinopoisk-image/1600647/430042eb-ee69-4818-aed0-a312400a26bf/300x450", context),
                    status = "просмотрено",
                    rating = 9
                ))
                filmDao.insert(Film(
                    name = "Властелин колец: Братство кольца",
                    genre = "фэнтези, приключения, dramm",
                    year_of_issue = LocalDateTime.of(2001, 12, 10, 0, 0, 0).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(),
                    poster = getBitmap("https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/1d36b3f8-3379-4801-9606-c330eed60a01/300x450", context),
                    status = "просмотрено",
                    rating = 8
                ))
                producerDao.insert(Producer(
                    name = "Фрэнк Дарабонт",
                    film_id = 1,
                ))
                producerDao.insert(Producer(
                    name = "Фрэнк Дарабонт",
                    film_id = 2,
                ))
                producerDao.insert(Producer(
                    name = "Питер Джексон",
                    film_id = 3,
                ))
                producerDao.insert(Producer(
                    name = "Кристофер Нолан",
                    film_id = 4,
                ))
                producerDao.insert(Producer(
                    name = "Питер Джексон",
                    film_id = 5,
                ))
            }
        }

        suspend fun getBitmap(url: String, context: Context): Bitmap {
            val loading = ImageLoader(context)
            val request = ImageRequest.Builder(context)
                .data(url)
                .build()

            val result = (loading.execute(request) as SuccessResult).drawable
            return (result as BitmapDrawable).bitmap
        }
    }
}