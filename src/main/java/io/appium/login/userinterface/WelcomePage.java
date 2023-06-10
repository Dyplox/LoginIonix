package io.appium.login.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class WelcomePage {

    public static final Target IMG_LOADER = Target.the("Loader image' ")
            .located(By.id("//android.view.ImageView:id/00000000-0000-03b7-ffff-ffff00000087"));


    public static final Target LBL_VISTA_WELCOME = Target.the("Tilutlo de la pagina 'Welcome' ")
            .located(By.xpath("//android.widget.TextView[@text, 'Welcome to ionix']"));

    public static final Target LBL_BACK_REGISTRE = Target.the("Regresar a Register")
            .located(By.id("android.view.ImageView:id/00000000-0000-01cf-ffff-ffff00000056"));

    public static final Target LBL_TITLE_WELCOME = Target.the("Welcome to ionix")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff0000004c"));

    public static final Target LBL_TITLE = Target.the("Your registration has been successful")
            .located(By.id("android.view.TextView:id/00000000-0000-01cf-ffff-ffff0000004d"));
}