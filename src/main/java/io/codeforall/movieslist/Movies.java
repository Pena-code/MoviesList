package io.codeforall.movieslist;

public class Movies {

    private int movieId;
    private String movieName;

    public Movies(int movieId, String movieName){

        this.movieId = movieId;
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }
}
