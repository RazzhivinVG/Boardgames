package com.example.moviediary.ui.addeditfilm

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.moviediary.data.Film
import com.example.moviediary.data.Producer
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class AddEditFilmFragmentArgs(
  val film: Film? = null,
  val producers: Array<Producer>? = null,
  val fragmentTitle: String
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Film::class.java)) {
      result.putParcelable("film", this.film as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Film::class.java)) {
      result.putSerializable("film", this.film as Serializable?)
    }
    result.putParcelableArray("producers", this.producers)
    result.putString("fragment_title", this.fragmentTitle)
    return result
  }

  companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    fun fromBundle(bundle: Bundle): AddEditFilmFragmentArgs {
      bundle.setClassLoader(AddEditFilmFragmentArgs::class.java.classLoader)
      val __film : Film?
      if (bundle.containsKey("film")) {
        if (Parcelable::class.java.isAssignableFrom(Film::class.java) ||
            Serializable::class.java.isAssignableFrom(Film::class.java)) {
          __film = bundle.get("film") as Film?
        } else {
          throw UnsupportedOperationException(Film::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __film = null
      }
      val __producers : Array<Producer>?
      if (bundle.containsKey("producers")) {
        __producers = bundle.getParcelableArray("producers")?.map { it as Producer }?.toTypedArray()
      } else {
        __producers = null
      }
      val __fragmentTitle : String?
      if (bundle.containsKey("fragment_title")) {
        __fragmentTitle = bundle.getString("fragment_title")
        if (__fragmentTitle == null) {
          throw IllegalArgumentException("Argument \"fragment_title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"fragment_title\" is missing and does not have an android:defaultValue")
      }
      return AddEditFilmFragmentArgs(__film, __producers, __fragmentTitle)
    }
  }
}
