package io.appium.login.stepsDefinitions.conf;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    public static final Actor ABEL = Actor.named("Abel Gutierrez Arias");

    @Steps(shared = true)
    SharedComponents sharedComponents;

    @Before
    public void setUp(Scenario scenario) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "M2102J20SG");
        capabilities.setCapability("platformVersion", "12S");
        capabilities.setCapability("appPackge", "com.appqa");
        //capabilities.setCapability("appActivity", "com.appqa.appqa");
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);

        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/apps/app-test-QA.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        sharedComponents.setDriver(driver);

        OnStage.setTheStage(new OnlineCast());
        ABEL.whoCan(BrowseTheWeb.with(driver));
    }

    @After
    public void setDown(Scenario scenario) throws MalformedURLException {
        AppiumDriver driver = sharedComponents.getDriver();
        driver.close();
        driver.quit();
    }
}