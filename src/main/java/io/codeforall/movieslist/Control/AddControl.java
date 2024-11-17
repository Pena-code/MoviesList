package io.codeforall.movieslist.Control;

import io.codeforall.movieslist.MovieService;
import io.codeforall.movieslist.View.AddView;
import io.codeforall.movieslist.View.MenuView;

public class AddControl implements Control{
    private MovieService movieService;
    private MenuView menuView;

    private AddView addView;
    @Override
    public void init() {
        addView.show();
        movieService.addMovie(addView.getMovieName());
        menuView.show();
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    public void setAddView(AddView addView) {
        this.addView = addView;
    }

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }
}
