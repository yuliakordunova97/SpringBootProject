package com.example.springbootproject.exception;

public class NorFoundException extends RuntimeException{

    private String name;

    public NorFoundException(String message, String name) {
        super(message);
        this.name = name;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "not found with name " + name;
    }
}
