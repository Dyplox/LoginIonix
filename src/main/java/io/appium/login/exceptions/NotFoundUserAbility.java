package io.appium.login.exceptions;

public class NotFoundUserAbility extends RuntimeException {
    public NotFoundUserAbility() {
        super("El actor no tiene esta habilidad");
    }

}
