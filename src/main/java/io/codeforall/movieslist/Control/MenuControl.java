package io.codeforall.movieslist.Control;

import io.codeforall.movieslist.Control.AddControl;
import io.codeforall.movieslist.Control.Control;
import io.codeforall.movieslist.Control.DeleteControl;
import io.codeforall.movieslist.Control.ListControl;
import io.codeforall.movieslist.MovieService;
import io.codeforall.movieslist.View.AddView;
import io.codeforall.movieslist.View.DeleteView;
import io.codeforall.movieslist.View.MenuView;

public class MenuControl implements Control {

    private MovieService movieService;
    private AddView addView;
    private DeleteView deleteView;
    private MenuView menuView;
    private ListControl listControl;
    private AddControl addControl;
    private DeleteControl deleteControl;

    public int menuOption;

    @Override
    public void init() {
        //SHOW
    }

    public void getOption(int menuOption){

        switch (menuOption){
            case 1:
                listControl.init();
            case 2:
                addControl.init();
            case 3:
                deleteControl.init();
            case 4:
                try {
                    System.out.println("Bye Bye!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.exit(0);
        }
    }

    public void setAddControl(AddControl addControl) {
        this.addControl = addControl;
    }

    public void setDeleteControl(DeleteControl deleteControl) {
        this.deleteControl = deleteControl;
    }

    public void setListControl(ListControl listControl) {
        this.listControl = listControl;
    }
}
