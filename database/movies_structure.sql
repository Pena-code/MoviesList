DROP DATABASE IF EXISTS movieslist;
CREATE DATABASE movieslist;
USE movieslist;

CREATE TABLE movies(
    movie_id INTEGER UNIQUE NOT NULL AUTO_INCREMENT,
    movie_name CHAR(40) NOT NULL,

    PRIMARY KEY (movie_id)
);
