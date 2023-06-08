package io.appium.login.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        publish = true,
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "co.com.booking.steps",
        tags = "@Regression",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
