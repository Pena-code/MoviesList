package io.codeforall.movieslist.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class AddView implements View{

    private String movie;
    @Override
    public void show() {

        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner input = new StringInputScanner();
        input.setMessage("Insert movie name: ");

        movie = prompt.getUserInput(input);
    }

    public String getMovieName() {
        return movie;
    }
}
