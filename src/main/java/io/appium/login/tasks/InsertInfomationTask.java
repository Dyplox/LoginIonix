package io.appium.login.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static io.appium.login.userinterface.SingInPage.BTN_EMAIL_CONFIRM;
import static io.appium.login.userinterface.SingInPage.BTN_SUBMIT;
import static io.appium.login.userinterface.SingInPage.IPT_EMAIL;
import static io.appium.login.userinterface.SingInPage.IPT_PASSWORD;
import static io.appium.login.userinterface.SingInPage.IPT_PASSWORD_REPEAT;
import static io.appium.login.userinterface.SingInPage.IPT_USERNAME;
import static io.appium.login.userinterface.SingInPage.LBL_TITLE_LOGIN;
import static io.appium.login.userinterface.SingInPage.PUP_EMAIL_OPTIONAL;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class InsertInfomationTask implements Task {
    private final String userName;
    private final String passWord;
    private final String repeatPassWord;

    public InsertInfomationTask(String userName, String passWord, String repeatPassWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.repeatPassWord = repeatPassWord;
    }

    public static InsertInfomationTask withCustomerData(String userName, String passWord, String repeatPassWord) {
        return instrumented(InsertInfomationTask.class, userName, passWord, repeatPassWord);
    }

    @Override
    @Step("{0} enter login data")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_TITLE_LOGIN, isVisible()).forNoMoreThan(5).seconds(),

                Enter.theValue(userName).into(IPT_USERNAME),
                Enter.theValue(passWord).into(IPT_PASSWORD),
                Enter.theValue(repeatPassWord).into(IPT_PASSWORD_REPEAT)
        );
    }
}