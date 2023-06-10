package io.appium.login.tasks.common;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static io.appium.login.userinterface.SingInPage.LBL_VISTA;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NavigateTo {
    private NavigateTo() {
        //Nothing
    }

    public static Performable register() {
        return Task.where("{0} opens the app",
                WaitUntil.the(LBL_VISTA, isVisible()).forNoMoreThan(10).seconds()
        );
    }

}