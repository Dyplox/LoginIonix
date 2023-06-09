package io.appium.login.runners;

import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        publish = true,
        features = "src/test/resources/features/auth.feature",
        glue = "io.appium.login.stepsDefinitions",
        tags = "@Regression",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:target/cucumber"}
)
public class TestRunner {
}