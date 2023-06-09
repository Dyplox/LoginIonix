package io.appium.login.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import io.appium.login.utils.data.LoginData;

public class LoadDataTask implements Task {

    private final Map<String, String> testData;

    public LoadDataTask(Map<String, String> testData) {
        this.testData = testData;
    }

    public static LoadDataTask infomacionLogin(Map<String, String> testData) {
        return instrumented(LoadDataTask.class, testData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String, String>> testDataAux = testData.entrySet();
        LoginData.setData(testDataAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}