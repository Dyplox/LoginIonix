package io.appium.login.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class SingInPage {

    // dr.findElement(By.id("android:id/text1")).click(); //for Android
    //driver.findElement(By.xpath("//android.widget.TextView[@text=‘ADD’]"))
    //By.xpath("//*[@text='" + element + "']");

    //[contains(text(),’’)]
    //[contains(@id,’’)]
    //*[contains(@xpath,’’)]

    public static final Target LBL_VISTA = Target.the("Tilutlo de la pagina 'Register'")
            //.located(By.id("android.view.View:id/00000000-0000-01cf-ffff-ffff00000025"));
            .located(By.xpath("//android.view.View[@text='Register']"));

    // Fomrulario de ingreso - titulo
    public static final Target LBL_TITLE_LOGIN = Target.the("Tilutlo de la pagina 'Create an account'")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff00000015"));

    // Username
    public static final Target IPT_USERNAME = Target.the("Input de Username")
            .located(By.id("android.view.EditText:id/00000000-0000-01cf-ffff-ffff00000016"));

    public static final Target LBL_USERNAME_ALARM = Target.the("Input de Username")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff00000033"));

    // Password
    public static final Target IPT_PASSWORD = Target.the("Input de Password")
            .located(By.id("android.view.EditText:id/00000000-0000-01cf-ffff-ffff00000017"));

    public static final Target LBL_PASSWORD_ALARM = Target.the("Input de Password")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff00000028"));


    public static final Target IPT_PASSWORD_REPEAT = Target.the("Input de Password Repeat")
            .located(By.id("android.view.EditText:id/00000000-0000-01cf-ffff-ffff00000018"));

    public static final Target LBL_PASSWORD_REPEAT_ALARM = Target.the("Input de Password Repeat")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff00000018"));

    // Email
    public static final Target IPT_EMAIL = Target.the("Input de emial")
            .located(By.id("android.view.EditText:id/00000000-0000-01cf-ffff-ffff00000019"));

    public static final Target LBL_EMAIL_ALARM = Target.the("Input de email")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff0000002d"));

    //  Validacion de email no puesto
    public static final Target PUP_EMAIL_OPTIONAL = Target
            .the("Your email is empty, we recommended since is needed for account recovery, do you want continue?\n")
            .located(By.id("android.view.TextView:id/00000000-0000-03bb-ffff-ffff00000032"));

    public static final Target BTN_EMAIL_CANCEL = Target.the("Boton de email cancel")
            .located(By.id("android.view.TextView:id/00000000-0000-03bb-ffff-ffff00000033"));

    public static final Target BTN_EMAIL_CONFIRM = Target.the("Boton de email cancel")
            .located(By.id("android.view.TextView:id/00000000-0000-03bb-ffff-ffff00000035"));

    // Boton enviar
    public static final Target BTN_SUBMIT = Target.the("Boton enviar")
            .located(By.id("android.view.Button:id/00000000-0000-01cf-ffff-ffff0000001a"));


    private SingInPage() {
        //Nothing
    }
}