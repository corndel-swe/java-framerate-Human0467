package com.corndel.framerate.exercises;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinThymeleaf;

import java.util.Map;

public class D1E2 {

  public static Javalin createApp() {
    var app = Javalin.create(
        config -> {
          config.fileRenderer(new JavalinThymeleaf());
        });

    app.get(
        "/d1e2",
        ctx -> {
          var message = "Hello from d1e2!";
          ctx.render("exercises/templates/d1e2.html", Map.of("msg", message));
          // Render 'Open resources/templates/d1e2.html' and pass the message
          // d1e2.html and follow the instructions
        });

    return app;
  }

    public static void main(String[] args) {
        var javalin = createApp();
        javalin.start(8080);
    }
}
