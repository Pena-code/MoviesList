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
        AddControl addControl = new AddControl();
        DeleteControl deleteControl = new DeleteControl();
        DeleteView deleteView = new DeleteView();
        MovieService movieService = new MovieService();
        AddView addView = new AddView();
        MovieDao movieDao = new MovieDao();
        ListView listView = new ListView();
        ListControl listControl = new ListControl();

        addControl.setMenuView(menuView);
        addControl.setMovieService(movieService);
        addControl.setAddView(addView);

        deleteControl.setDeleteView(deleteView);
        deleteControl.setMovieService(movieService);
        deleteControl.setMenuView(menuView);
        deleteControl.setListView(listView);

        menuControl.setAddControl(addControl);
        menuControl.setDeleteControl(deleteControl);
        menuControl.setListControl(listControl);

        menuView.setMenuControl(menuControl);
        listView.setListControl(listControl);
        listControl.setListView(listView);
        listControl.setMovieService(movieService);
        listControl.setMenuView(menuView);

        movieService.setMovieDao(movieDao);

        menuView.show();

    }
}
