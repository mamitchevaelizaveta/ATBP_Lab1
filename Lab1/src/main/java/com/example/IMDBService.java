package com.example;

import com.example.exception.MovieRatingNotFoundException;

public interface IMDBService {

    // геттер, возвращающий movieRating
    Integer getMovieRating(String movieId) throws MovieRatingNotFoundException;

}

