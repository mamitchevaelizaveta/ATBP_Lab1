package com.example.exception;

import java.io.IOException;

public class MovieRatingNotFoundException extends IOException {
    public MovieRatingNotFoundException(String message) {
        super(message);
    }
}
