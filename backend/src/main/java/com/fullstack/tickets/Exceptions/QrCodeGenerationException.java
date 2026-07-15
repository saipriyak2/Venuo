package com.fullstack.tickets.Exceptions;

public class QrCodeGenerationException extends RuntimeException {
    public QrCodeGenerationException(String message) {
        super(message);
    }
}
