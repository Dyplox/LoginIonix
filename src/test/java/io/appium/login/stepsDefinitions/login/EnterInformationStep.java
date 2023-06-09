package io.appium.login.stepsDefinitions.login;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class EnterInformationStep {

    @Cuando("el ingresa {string}, {string}, {string} y {string}")
    public void elIngresaYYYEnSusRespectivosCampos(String userName, String password, String repeatPassword, String email) {
    }

    @Entonces("valida el ingreso y carga la pagina Welcome")
    public void validaElIngresoYCargaLaPaginaWelcome() {
    }

    @Entonces("valida el las alertas para cada campo")
    public void validaElLasAlertasParaCadaCampo() {
    }
}