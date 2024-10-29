package com.corndel.framerate.exercises;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

import java.util.List;
import java.util.Map;

public class D1E3 {
  public static Javalin createApp() {
    var app = Javalin.create(
        config -> {
          config.fileRenderer(new JavalinThymeleaf());
        });

    app.get(
        "/d1e3",
        ctx -> {
          var shopping = List.of(
              "Eggs",
              "Flour",
              "Sugar",
              "Lifesize cutout of Christian Bale as Batman",
              "Milk",
              "Bread");
          // Render 'd1e3.html', passing the value of `shopping`
            ctx.render("exercises/templates/d1e3.html", Map.of("list", shopping));
          // TODO: Open d1e3.html and follow the instructions
        });

    return app;
  }

    public static void main(String[] args) {
        var javalin = createApp();
        javalin.start(8080);
    }
}
