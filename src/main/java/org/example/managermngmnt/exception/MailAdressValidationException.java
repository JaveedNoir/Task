package org.example.managermngmnt.exception;

public class MailAdressValidationException extends RuntimeException {
    public MailAdressValidationException() {
        super("Gecerli bir mail adresi girin!");
    }
}
