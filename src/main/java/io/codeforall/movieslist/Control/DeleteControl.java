package io.codeforall.movieslist.Control;

import io.codeforall.movieslist.MovieService;
import io.codeforall.movieslist.View.DeleteView;
import io.codeforall.movieslist.View.ListView;
import io.codeforall.movieslist.View.MenuView;

public class DeleteControl implements Control{

    private DeleteView deleteView;
    private MovieService movieService;
    private MenuView menuView;
    private ListView listView;
    @Override
    public void init() {
        listView.show();
        deleteView.show();
        movieService.deleteMovie(deleteView.getMovieId());
        menuView.show();
    }

    public void setDeleteView(DeleteView deleteView) {
        this.deleteView = deleteView;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }
}
