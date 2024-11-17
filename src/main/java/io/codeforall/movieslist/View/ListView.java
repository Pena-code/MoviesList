package io.codeforall.movieslist.View;

import io.codeforall.movieslist.Control.ListControl;
import io.codeforall.movieslist.Movies;

import java.util.List;

public class ListView implements View{
    private ListControl listControl;
    private MenuView menuView;
    private Movies movies;

    private List<Movies> moviesList;

    @Override
    public void show() {
        moviesList = listControl.getMoviesList();

        System.out.println("This is your Movies list: \n");
        for(int i = 0; i < moviesList.size(); i ++){

            System.out.println(moviesList.get(i).getMovieId() + " - " + moviesList.get(i).getMovieName());
        }
        menuView.show();
    }

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }

    public void setListControl(ListControl listControl) {
        this.listControl = listControl;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
