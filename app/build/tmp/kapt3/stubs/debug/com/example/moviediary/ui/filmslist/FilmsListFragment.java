package com.example.moviediary.ui.filmslist;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.moviediary.R;
import com.example.moviediary.data.Film;
import com.example.moviediary.data.Producer;
import com.example.moviediary.data.SortOrder;
import com.example.moviediary.databinding.FilmsListFragmentBinding;
import com.example.moviediary.ui.filmslist.FilmsListAdapter.OnItemClickListener;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$OnItemClickListener;", "()V", "filmsListAdapter", "Lcom/example/moviediary/ui/filmslist/FilmsListAdapter;", "filmsListViewModel", "Lcom/example/moviediary/ui/filmslist/FilmsListViewModel;", "getFilmsListViewModel", "()Lcom/example/moviediary/ui/filmslist/FilmsListViewModel;", "filmsListViewModel$delegate", "Lkotlin/Lazy;", "searchView", "Landroidx/appcompat/widget/SearchView;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onItemClick", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)V", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FilmsListFragment extends androidx.fragment.app.Fragment implements com.example.moviediary.ui.filmslist.FilmsListAdapter.OnItemClickListener {
    private final kotlin.Lazy filmsListViewModel$delegate = null;
    private final com.example.moviediary.ui.filmslist.FilmsListAdapter filmsListAdapter = null;
    private androidx.appcompat.widget.SearchView searchView;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.moviediary.ui.filmslist.FilmsListViewModel getFilmsListViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
    com.example.moviediary.data.Producer[] producers) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public FilmsListFragment() {
        super();
    }
}