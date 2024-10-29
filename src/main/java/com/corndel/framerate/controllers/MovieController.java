package com.corndel.framerate.controllers;

import java.sql.SQLException;
import java.util.Map;

import com.corndel.framerate.models.Movie;
import com.corndel.framerate.repositories.MovieRepository;
import io.javalin.http.*;

public class MovieController {

    public static void renderMovies(Context ctx){
        ctx.render("/templates/index");
    }

    public static void getAllMovies(Context ctx) throws SQLException {
        var movies = MovieRepository.findAll();
        if(!movies.isEmpty()) {
            ctx.render("/index", Map.of("movies", movies)).status(200);
        }else{
            throw new NotFoundResponse("No movies found.");
        }
    }

    public static void getMovieById(Context ctx) throws SQLException {
        ctx.pathParamAsClass("movieId", Integer.class)
                .check(id -> id > 0, "ID must be greater than 0")
                .get();

        int id = Integer.parseInt(ctx.pathParam("movieId"));
        Movie movie = MovieRepository.findById(id);
        if(movie!=null) {
            ctx.render("/movie_details", Map.of("movie", movie)).status(200);
        }else{
            throw new NotFoundResponse("No product with that ID");
        }
    }
}
