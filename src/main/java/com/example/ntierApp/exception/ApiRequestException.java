package com.example.ntierApp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiRequestException extends RuntimeException {

    private final static Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);
    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message,cause);
    }
}
