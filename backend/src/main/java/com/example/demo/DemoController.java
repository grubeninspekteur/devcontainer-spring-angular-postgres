package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Movie;
import com.example.demo.data.MovieRepository;

@RestController
@RequestMapping("api")
public class DemoController {

    private final MovieRepository movieRepository;

    public DemoController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public String getHelloWorld() {
        return "hello from Spring Boot!";
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
