package io.codeforall.movieslist.View;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;

public class DeleteView implements View{

    private int movieId;
    @Override
    public void show() {

        Prompt prompt = new Prompt(System.in, System.out);

        IntegerInputScanner input = new IntegerInputScanner();
        input.setMessage("Insert movie number to delete: ");

        movieId = prompt.getUserInput(input);
    }

    public int getMovieId() {
        return movieId;
    }
}
