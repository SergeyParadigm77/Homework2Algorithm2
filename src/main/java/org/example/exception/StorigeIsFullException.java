package org.example.exception;

public class StorigeIsFullException extends RuntimeException {
    public StorigeIsFullException() {
    }

    public StorigeIsFullException(String message) {
        super(message);
    }

    public StorigeIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorigeIsFullException(Throwable cause) {
        super(cause);
    }

    public StorigeIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
