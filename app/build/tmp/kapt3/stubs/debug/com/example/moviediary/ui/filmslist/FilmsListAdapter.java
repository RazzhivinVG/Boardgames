package com.example.moviediary.ui.filmslist;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.moviediary.data.Film;
import com.example.moviediary.data.Producer;
import com.example.moviediary.databinding.FilmItemFragmentBinding;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001b\u001c\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0014\u0010\u0019\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/moviediary/data/Film;", "Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$FilmsListViewHolder;", "listener", "Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$OnItemClickListener;", "(Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$OnItemClickListener;)V", "filmsList", "", "producersList", "", "", "Lcom/example/moviediary/data/Producer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilms", "films", "setProducers", "producers", "DiffCallback", "FilmsListViewHolder", "OnItemClickListener", "app_debug"})
public final class FilmsListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.moviediary.data.Film, com.example.moviediary.ui.filmslist.FilmsListAdapter.FilmsListViewHolder> {
    private java.util.List<com.example.moviediary.data.Film> filmsList;
    private java.util.List<com.example.moviediary.data.Producer[]> producersList;
    private final com.example.moviediary.ui.filmslist.FilmsListAdapter.OnItemClickListener listener = null;
    
    public final void setFilms(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviediary.data.Film> films) {
    }
    
    public final void setProducers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviediary.data.Producer> producers) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviediary.ui.filmslist.FilmsListAdapter.FilmsListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.ui.filmslist.FilmsListAdapter.FilmsListViewHolder holder, int position) {
    }
    
    public FilmsListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.moviediary.ui.filmslist.FilmsListAdapter.OnItemClickListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$OnItemClickListener;", "", "onItemClick", "", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)V", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Producer[] producers);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$FilmsListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/moviediary/databinding/FilmItemFragmentBinding;", "(Lcom/example/moviediary/ui/filmslist/FilmsListAdapter;Lcom/example/moviediary/databinding/FilmItemFragmentBinding;)V", "bind", "film", "Lcom/example/moviediary/data/Film;", "producers", "", "Lcom/example/moviediary/data/Producer;", "(Lcom/example/moviediary/data/Film;[Lcom/example/moviediary/data/Producer;)Lcom/example/moviediary/databinding/FilmItemFragmentBinding;", "app_debug"})
    public final class FilmsListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.moviediary.databinding.FilmItemFragmentBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviediary.databinding.FilmItemFragmentBinding bind(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film film, @org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Producer[] producers) {
            return null;
        }
        
        public FilmsListViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.databinding.FilmItemFragmentBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/moviediary/ui/filmslist/FilmsListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/moviediary/data/Film;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.moviediary.data.Film> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film oldItem, @org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film oldItem, @org.jetbrains.annotations.NotNull()
        com.example.moviediary.data.Film newItem) {
            return false;
        }
        
        public DiffCallback() {
            super();
        }
    }
}