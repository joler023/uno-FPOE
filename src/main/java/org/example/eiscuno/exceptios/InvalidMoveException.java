package org.example.eiscuno.exceptios;

public class InvalidMoveException extends RuntimeException {
    private int errorCode;

    public InvalidMoveException(String message) {
        super(message);
    }

    public InvalidMoveException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
