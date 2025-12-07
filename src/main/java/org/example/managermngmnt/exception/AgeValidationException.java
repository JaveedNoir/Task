package org.example.managermngmnt.exception;

public class AgeValidationException extends RuntimeException {
    public AgeValidationException() {
        super("Yas bos birakilamaz veya 18 den asagi olamaz!");
    }
}
