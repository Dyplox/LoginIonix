package io.appium.login.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class SingInPage {
    public static final Target LBL_VISTA = Target.the("Tilutlo de la pagina 'Register'")
            .located(By.xpath("//android.view.View[@text, 'Register']"));

    // Fomrulario de ingreso - titulo
    public static final Target LBL_TITLE_LOGIN = Target.the("Tilutlo de la pagina 'Create an account'")
            .located(By.xpath("//android.widget.TextView[@text='Create an account']"));

    // Username
    public static final Target IPT_USERNAME = Target.the("Input de Username")
            .located(By.xpath("//android.widget.EditText[@text='Username']"));

    public static final Target LBL_USERNAME_ALARM = Target.the("Input de Username")
            .located(By.xpath("//android.widget.TextView[@index='2']"));

    // Password
    public static final Target IPT_PASSWORD = Target.the("Input de Password")
            .located(By.xpath("//android.widget.EditText[@text='Password']"));

    public static final Target LBL_PASSWORD_ALARM = Target.the("Input de Password")
            .located(By.xpath("//android.widget.TextView[@index='4']"));


    public static final Target IPT_PASSWORD_REPEAT = Target.the("Input de Password Repeat")
            .located(By.xpath("//android.widget.EditText[@text='Repeat password']"));

    public static final Target LBL_PASSWORD_REPEAT_ALARM = Target.the("Input de Password Repeat")
            .located(By.xpath("//android.view.TextView:id/00000000-0000-01cf-ffff-ffff00000018"));

    // Email
    public static final Target IPT_EMAIL = Target.the("Input de emial")
            .located(By.xpath("//android.widget.EditText[@text='Email (Optional)']"));

    public static final Target LBL_EMAIL_ALARM = Target.the("Input de email")
            .located(By.xpath("//android.view.TextView:id/00000000-0000-01cf-ffff-ffff0000002d"));

    //  Validacion de email no puesto
    public static final Target PUP_EMAIL_OPTIONAL = Target
            .the("Your email is empty, we recommended since is needed for account recovery, do you want continue?\n")
            .located(By.xpath("//android.widget.TextView[@text='Your email is empty, we recommended since is needed for account recovery, do you want continue?']"));

    public static final Target BTN_EMAIL_CANCEL = Target.the("Boton de email cancel")
            .located(By.xpath("android.view.TextView:id/00000000-0000-03bb-ffff-ffff00000033"));

    public static final Target BTN_EMAIL_CONFIRM = Target.the("Boton de email cancel")
            .located(By.xpath("//android.widget.TextView[@text='Confirm']"));

    // Boton enviar
    public static final Target BTN_SUBMIT = Target.the("Boton enviar")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='SUBMIT']"));


    private SingInPage() {
        //Nothing
    }
}