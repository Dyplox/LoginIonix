package io.appium.login.stepsDefinitions.login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static io.appium.login.stepsDefinitions.conf.Hooks.ABEL;
import static io.appium.login.userinterface.WelcomePage.LBL_VISTA_WELCOME;
import static io.appium.login.utils.data.Constantes.CREATE_ACCOUNT;
import static io.appium.login.utils.data.Constantes.WELCOME_IONIX;
import static org.hamcrest.Matchers.equalTo;

import io.appium.login.questions.IsPresent;
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
        ABEL.should(seeThat("Pantalla Welcome Ionix", IsPresent.theTarget(LBL_VISTA_WELCOME), equalTo(WELCOME_IONIX)));
    }

    @Entonces("valida el las alertas para cada campo {string}")
    public void validaElLasAlertasParaCadaCampo(String description) {
        ABEL.should(seeThat("Valida la Alarmas presentes: ", IsPresent.theTarget(LBL_VISTA_WELCOME), equalTo(CREATE_ACCOUNT)));
        ABEL.attemptsTo();
        ABEL.should(seeThat("Regla del campo: ", IsPresent.theTarget(LBL_VISTA_WELCOME), equalTo(CREATE_ACCOUNT)));
    }
}