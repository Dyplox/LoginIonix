package io.appium.login.stepsDefinitions.common;

import static io.appium.login.models.UserInfoModel.userInfomation;
import static io.appium.login.stepsDefinitions.conf.Hooks.ABEL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.login.tasks.LoadDataTask;
import io.appium.login.tasks.common.NavigateTo;
import io.cucumber.java.es.Dado;

public class CommonSteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonSteps.class.getSimpleName());

    @Dado("que {string} se entcuentra en la vista para logueaser en la App")
    public void starAppQa(String nameActor) {
        ABEL.attemptsTo(NavigateTo.register());
        ABEL.wasAbleTo(LoadDataTask.infomacionLogin(userInfomation()));
        LOGGER.info("Data User is: {}", userInfomation().values());
    }
}