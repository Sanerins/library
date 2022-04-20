package ru.pobedonostsev.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchGenreException extends RuntimeException {
    public NoSuchGenreException(String message) {
        super(message);
    }
}
