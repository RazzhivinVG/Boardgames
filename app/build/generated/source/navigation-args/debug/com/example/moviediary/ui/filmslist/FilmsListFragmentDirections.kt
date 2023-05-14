package com.example.moviediary.ui.filmslist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.moviediary.R
import com.example.moviediary.data.Film
import com.example.moviediary.data.Producer
import java.io.Serializable
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress

class FilmsListFragmentDirections private constructor() {
  private data class ActionFilmsListFragmentToAddEditFilmFragment(
    val film: Film? = null,
    val producers: Array<Producer>? = null,
    val fragmentTitle: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_filmsListFragment_to_addEditFilmFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
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
  }

  companion object {
    fun actionFilmsListFragmentToAddEditFilmFragment(
      film: Film? = null,
      producers: Array<Producer>? = null,
      fragmentTitle: String
    ): NavDirections = ActionFilmsListFragmentToAddEditFilmFragment(film, producers, fragmentTitle)
  }
}
