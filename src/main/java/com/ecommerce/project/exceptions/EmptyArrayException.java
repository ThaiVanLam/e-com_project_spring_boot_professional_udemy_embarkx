package com.ecommerce.project.exceptions;

public class EmptyArrayException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EmptyArrayException() {
    }

    public EmptyArrayException(String message) {
        super(message);
    }
}
