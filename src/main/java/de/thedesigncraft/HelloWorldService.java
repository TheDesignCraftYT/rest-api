package de.thedesigncraft;

import static spark.Spark.get;

public class HelloWorldService {

    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello, world");
        get("/hello/:name", (req, res) -> "Hello, " + req.params(":name"));


    }

}
