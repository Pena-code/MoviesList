package io.codeforall.movieslist;

import io.codeforall.movieslist.Control.AddControl;
import io.codeforall.movieslist.Control.DeleteControl;
import io.codeforall.movieslist.Control.ListControl;
import io.codeforall.movieslist.Control.MenuControl;
import io.codeforall.movieslist.View.AddView;
import io.codeforall.movieslist.View.DeleteView;
import io.codeforall.movieslist.View.ListView;
import io.codeforall.movieslist.View.MenuView;

public class Main {

    public static void main(String[] args) {

        MenuControl menuControl = new MenuControl();
        MenuView menuView = new MenuView();
        menuView.setMenuControl(menuControl);
        AddControl addControl = new AddControl();
        menuControl.setAddControl(addControl);
        addControl.setMenuView(menuView);
        DeleteControl deleteControl = new DeleteControl();
        menuControl.setDeleteControl(deleteControl);
        DeleteView deleteView = new DeleteView();
        deleteControl.setDeleteView(deleteView);

        MovieService movieService = new MovieService();
        AddView addView = new AddView();
        addControl.setMovieService(movieService);
        addControl.setAddView(addView);
        deleteControl.setMovieService(movieService);
        deleteControl.setMenuView(menuView);

        MovieDao movieDao = new MovieDao();
        movieService.setMovieDao(movieDao);
        ListView listView = new ListView();
        listView.setMenuView(menuView);
        ListControl listControl = new ListControl();
        menuControl.setListControl(listControl);
        listControl.setListView(listView);
        listView.setListControl(listControl);
        listControl.setMovieService(movieService);

        menuView.show();

    }
}
