package ru.skypro.calculator.exception;

public class AllArgumentsException extends RuntimeException{
    public AllArgumentsException() {
    }

    public AllArgumentsException(String message) {
        super(message);
    }
}
