package io.codeforall.movieslist.View;

import io.codeforall.movieslist.Control.MenuControl;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public class MenuView implements View{

    private MenuControl menuControl;
    int answerIndex;
    private String []options = {"Movies List", "Add Movie", "Delete Movie", "Quit"};


    @Override
    public void show() {
        Prompt prompt = new Prompt(System.in, System.out);

        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("Welcome to your Movies App: ");

        answerIndex = prompt.getUserInput(scanner);

        menuControl.getOption(answerIndex);
    }
    public void setMenuControl(MenuControl menuControl) {
        this.menuControl = menuControl;
    }

}
