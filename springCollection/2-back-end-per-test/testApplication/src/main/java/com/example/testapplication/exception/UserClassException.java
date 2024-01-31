package com.example.testapplication.exception;

public class UserClassException extends RuntimeException{

    public UserClassException(String message) {
        super(message);
    }

    public UserClassException(String message, Throwable cause) {
        super(message, cause);
    }


    public UserClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
