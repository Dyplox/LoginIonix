package io.appium.login.stepsDefinitions.login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static io.appium.login.exceptions.NotFoundText.REGLA;
import static io.appium.login.stepsDefinitions.conf.Hooks.ABEL;
import static io.appium.login.userinterface.SingInPage.LBL_PASSWORD_ALARM;
import static io.appium.login.userinterface.SingInPage.LBL_USERNAME_ALARM;
import static io.appium.login.userinterface.WelcomePage.LBL_VISTA_WELCOME;
import static io.appium.login.utils.data.Constantes.WELCOME_IONIX;

import io.appium.login.exceptions.NotFoundText;
import io.appium.login.questions.ObtainText;
import io.appium.login.tasks.IngresarEmailTask;
import io.appium.login.tasks.InsertInfomationTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class EnterInformationStep {

    @Cuando("el ingresa {string}, {string}, {string} y {string}")
    public void elIngresaYYYEnSusRespectivosCampos(String userName, String password, String repeatPassword, String description) {
        ABEL.attemptsTo(InsertInfomationTask.withCustomerData(userName, password, repeatPassword));
    }

    @Cuando("ingresa el {string}")
    public void elIngresaEmail(String email) {
        ABEL.attemptsTo(IngresarEmailTask.withCustomerData(email));
    }

    @Entonces("valida el ingreso y carga de la pagina Welcome")
    public void validaElIngresoYCargaLaPaginaWelcome() {
        ABEL.should(seeThat("Pantalla Welcome Ionix", ObtainText.element(LBL_VISTA_WELCOME), equalTo(WELCOME_IONIX)));
    }

    @Entonces("valida el las alertas para el campo username {string}")
    public void validaElLasAlertasParaCadaCampoUserName(String description) {
        ABEL.should(seeThat("No cumple con la reglas del campo Username: ",
                        ObtainText.element(LBL_USERNAME_ALARM), equalTo(description)
                ).orComplainWith(NotFoundText.class, REGLA)
        );
    }

    @Entonces("valida el las alertas para el campo password {string}")
    public void validaElLasAlertasParaCadaCampoPassword(String description) {
        ABEL.should(seeThat("No cumple con la reglas del campo Username: ",
                        ObtainText.element(LBL_PASSWORD_ALARM), equalTo(description)
                ).orComplainWith(NotFoundText.class, REGLA)
        );
    }
}