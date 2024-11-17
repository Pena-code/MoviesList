package io.codeforall.movieslist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {

    private Connection connection;

    public List getList(){
        List<Movies> moviesList = new ArrayList<>();

        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieslist", "root", "");

                String query = "SELECT * FROM movies";
                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(query);

                while(resultSet.next()){
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    moviesList.add(new Movies(id, name));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Failure to connect to database : " + ex.getMessage());
        }
        return moviesList;
    }

    public void addMovie(String movie){
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieslist", "root", "");

                String query = "INSERT INTO movies (movie_name) VALUES (?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, movie);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            System.out.println("Failure to connect to database : " + ex.getMessage());
        }
        System.out.println("Movie - " + movie + " - added successfully");

    }

    public void deleteMovie(int movieId){
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieslist", "root", "");

                String query = "DELETE FROM movies WHERE movie_id = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, movieId);

                statement.executeUpdate();

            }
        } catch (SQLException ex) {
            System.out.println("Failure to connect to database : " + ex.getMessage());
        }
        System.out.println("Movie " + movieId + " deleted successfully");
    }

}
