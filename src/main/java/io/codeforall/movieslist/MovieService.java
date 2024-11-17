package io.codeforall.movieslist;

import java.util.List;

public class MovieService {

    private MovieDao movieDao;

    public List moviesList(){

        return movieDao.getList();
    }

    public void addMovie(String movieName){
        movieDao.addMovie(movieName);
    }

    public void deleteMovie(int movieId){
        movieDao.deleteMovie(movieId);
    }

    public void setMovieDao(MovieDao movieDao) {
        this.movieDao = movieDao;
    }
}
