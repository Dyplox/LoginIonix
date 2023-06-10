package io.appium.login.exceptions;

public class NotFoundText extends AssertionError {
    public static final String REGLA = "La regla no se cumple";

    public NotFoundText(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundText(String message) {
        super(message);
    }

}