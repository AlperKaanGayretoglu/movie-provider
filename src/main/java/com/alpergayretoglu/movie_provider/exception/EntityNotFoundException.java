package com.alpergayretoglu.movie_provider.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
public class EntityNotFoundException extends RuntimeException {

    private final HttpStatus statusCode = HttpStatus.NOT_FOUND;
    private final String message = "Entity with given credentials was not found";

}
