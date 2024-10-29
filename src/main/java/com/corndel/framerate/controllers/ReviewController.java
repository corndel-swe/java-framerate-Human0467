package com.corndel.framerate.controllers;

import java.sql.SQLException;

import com.corndel.framerate.models.Movie;
import com.corndel.framerate.repositories.MovieRepository;
import com.corndel.framerate.repositories.ReviewRepository;
import io.javalin.http.*;

public class ReviewController {
    public static void getReviewsById(Context ctx) throws SQLException {
        ctx.pathParamAsClass("movieId", Integer.class)
                .check(id -> id > 0, "ID must be greater than 0")
                .get();

        int id = Integer.parseInt(ctx.pathParam("movieId"));
        var reviews = ReviewRepository.findByMovie(id);
    }

    public static void postNewReview(Context ctx) throws SQLException {
        ctx.pathParamAsClass("movieId", Integer.class)
                .check(id -> id > 0, "ID must be greater than 0")
                .get();
        int id = Integer.parseInt(ctx.pathParam("movieId"));

        int rating = ctx.formParamAsClass("rating", Integer.class).get();
        String content = ctx.formParamAsClass("content", String.class).get();


    }


}
