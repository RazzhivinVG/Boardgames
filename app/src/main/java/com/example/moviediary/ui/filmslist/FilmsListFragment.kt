package com.example.moviediary.ui.filmslist

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviediary.R
import com.example.moviediary.data.Film
import com.example.moviediary.data.Producer
import com.example.moviediary.data.SortOrder
import com.example.moviediary.databinding.FilmsListFragmentBinding
import com.example.moviediary.ui.filmslist.FilmsListAdapter.OnItemClickListener
import com.example.moviediary.util.exhaustive
import com.example.moviediary.util.onQueryTextChanged
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class FilmsListFragment : Fragment(R.layout.films_list_fragment),  OnItemClickListener{

    private val filmsListViewModel: FilmsListViewModel by viewModels()

    private val filmsListAdapter: FilmsListAdapter = FilmsListAdapter(this)

    private lateinit var searchView: SearchView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FilmsListFragmentBinding.bind(view)

        binding.apply {
            filmsList.apply {
                adapter = filmsListAdapter
                layoutManager = LinearLayoutManager(requireContext())
                setHasFixedSize(true)
            }

            ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0,
                    ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT){
                override fun onMove(
                        recyclerView: RecyclerView,
                        viewHolder: RecyclerView.ViewHolder,
                        target: RecyclerView.ViewHolder
                ): Boolean {
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    val note = filmsListAdapter.currentList[viewHolder.adapterPosition]
                    filmsListViewModel.onFilmItemSwiped(note)
                }
            }).attachToRecyclerView(filmsList)

            fabAddList.setOnClickListener {
                filmsListViewModel.onAddNewFilmClick()
            }
        }

        filmsListViewModel.allList.observe(viewLifecycleOwner) {
            filmsListAdapter.setFilms(it.first)
            filmsListAdapter.setProducers(it.second)
        }

        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            filmsListViewModel.filmsListEvent.collect { event ->
                when (event) {
                    is FilmsListViewModel.FilmsListEvent.ShowUndoDeleteNoteMessage -> {
                        Snackbar.make(requireView(), "Запись удалена", Snackbar.LENGTH_LONG)
                            .setAction( "ОТМЕНИТЬ") {
                                filmsListViewModel.onUndoDeleteClick(event.film)
                            }.show()
                    }
                    is FilmsListViewModel.FilmsListEvent.NavigateToEditFilmScreen -> {
                        val action = FilmsListFragmentDirections.actionFilmsListFragmentToAddEditFilmFragment(event.film, event.producers, "Редактирование фильма")
                        findNavController().navigate(action)
                    }
                    is FilmsListViewModel.FilmsListEvent.NavigateToAddFilmScreen -> {
                        val action = FilmsListFragmentDirections.actionFilmsListFragmentToAddEditFilmFragment(null, null, "Новый фильм")
                        findNavController().navigate(action)
                    }
                }.exhaustive
            }
        }

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_films_list, menu)

        val searchItem = menu.findItem(R.id.action_search)
        searchView = searchItem.actionView as SearchView

        val pendingQuery = filmsListViewModel.searchQuery.value
        if (pendingQuery != null && pendingQuery.isNotEmpty()) {
            searchItem.expandActionView()
            searchView.setQuery(pendingQuery, false)
        }

        searchView.onQueryTextChanged {
            filmsListViewModel.searchQuery.value = it
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_sort_by_name -> {
                filmsListViewModel.onSortOrderSelected(SortOrder.BY_NAME)
                true
            }
            R.id.action_sort_by_year -> {
                filmsListViewModel.onSortOrderSelected(SortOrder.BY_YEAR)
                true
            }
            R.id.action_sort_by_genre -> {
                filmsListViewModel.onSortOrderSelected(SortOrder.BY_GENRE)
                true
            }
            R.id.action_sort_by_producer -> {
                filmsListViewModel.onSortOrderSelected(SortOrder.BY_PRODUCER)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onItemClick(film: Film, producers: Array<Producer>) {
        filmsListViewModel.onFilmSelected(film, producers)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        searchView.setOnQueryTextListener(null)
    }
}