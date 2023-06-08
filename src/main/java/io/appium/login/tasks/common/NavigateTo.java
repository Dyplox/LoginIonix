package io.appium.login.tasks.common;

import static io.appium.login.userinterface.SingInPage.BTN_CLOSE_WINDOW;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateTo {
    private NavigateTo() {
        //Nothing
    }

    public static Performable theStaysTab() {
        return Task.where("{0} opens the Booking app",
                Click.on(BTN_CLOSE_WINDOW)
                //WaitUntil.the(SEARCH_FIELDS, isEnabled()).forNoMoreThan(5).seconds()
        );
    }

}
