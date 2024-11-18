package io.codeforall.movieslist.Control;

import io.codeforall.movieslist.MovieService;
import io.codeforall.movieslist.View.ListView;
import io.codeforall.movieslist.View.MenuView;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.List;

public class ListControl implements Control{

    private MovieService movieService;
    private ListView listView;
    private MenuView menuView;


    @Override
    public void init() {
    listView.show();

    menuView.show();
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

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }
}
