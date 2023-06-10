package io.appium.login.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static io.appium.login.userinterface.SingInPage.BTN_EMAIL_CONFIRM;
import static io.appium.login.userinterface.SingInPage.BTN_SUBMIT;
import static io.appium.login.userinterface.SingInPage.IPT_EMAIL;
import static io.appium.login.userinterface.SingInPage.PUP_EMAIL_OPTIONAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class IngresarEmailTask implements Task {

    private final String email;

    public IngresarEmailTask(String email) {
        this.email = email;
    }

    public static IngresarEmailTask withCustomerData(String email) {
        return instrumented(IngresarEmailTask.class, email);
    }

    @Override
    @Step("{0} enter email")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(!email.isEmpty())
                        .andIfSo(
                                Enter.theValue(email).into(IPT_EMAIL),
                                Click.on(BTN_SUBMIT)
                        ).otherwise(
                                Click.on(BTN_SUBMIT),
                                WaitUntil.the(PUP_EMAIL_OPTIONAL, isVisible()).forNoMoreThan(2).seconds(),
                                Click.on(BTN_EMAIL_CONFIRM)
                        )
        );
    }
}