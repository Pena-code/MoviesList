package io.codeforall.movieslist.Control;

import io.codeforall.movieslist.MovieService;
import io.codeforall.movieslist.View.ListView;

import java.util.List;

public class ListControl implements Control{

    private MovieService movieService;
    private ListView listView;


    @Override
    public void init() {
    listView.show();
    }

    public List getMoviesList(){

        return movieService.moviesList();
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }
}
