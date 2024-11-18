package io.codeforall.movieslist.View;

import io.codeforall.movieslist.Control.ListControl;
import io.codeforall.movieslist.Movies;

import java.util.List;

public class ListView implements View{
    private ListControl listControl;

    private List<Movies> moviesList;

    @Override
    public void show() {
        moviesList = listControl.getMoviesList();

        System.out.println("This is your Movies list: \n");
        for(int i = 0; i < moviesList.size(); i ++){

            System.out.println("Movie number " + moviesList.get(i).getMovieId() + " - " + moviesList.get(i).getMovieName());


        }
    }

    public void setListControl(ListControl listControl) {
        this.listControl = listControl;
    }

}
