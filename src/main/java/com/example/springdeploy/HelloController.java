package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //Para poder usar este método lo único que tenemos que hacer es asociar una URL

    //Nos permite inyectar una propiedad
    @Value("${app.message}")
    //@Value("${app.varexample}")
    String message;


    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return "Hola Mundooo!";
    }


    @GetMapping("/bootstrap")
    public String bootstrap(){
        //La triple comilla """ nos permite introducir tanta lineas como queramos sin concatenar con el símbolo +
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hello, world desde Spring Boot!</h1>
                    <a class="btn btn-primary" href="http://www.google.es"> Google </a>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
                  </body>
                </html>
                """;
    }
}
