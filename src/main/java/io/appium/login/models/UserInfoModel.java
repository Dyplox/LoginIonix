package io.appium.login.models;

import static io.appium.login.utils.data.Constantes.EMAIL;
import static io.appium.login.utils.data.Constantes.PASSWORD;
import static io.appium.login.utils.data.Constantes.REPEAT_PASSWORD;
import static io.appium.login.utils.data.Constantes.USER_NAME;

import java.util.HashMap;
import java.util.Map;

public class UserInfoModel {
    private static final Map<String, String> infoUser = new HashMap<>();

    public UserInfoModel() {
    }

    public static Map<String, String> userInfomation() {
        infoUser.put(USER_NAME, LoginInfomationModel.LOGIN.getUserName());
        infoUser.put(PASSWORD, LoginInfomationModel.LOGIN.getPassWord());
        infoUser.put(REPEAT_PASSWORD, LoginInfomationModel.LOGIN.getRepeatPassWord());
        infoUser.put(EMAIL, LoginInfomationModel.LOGIN.getEmail());
        return infoUser;
    }
}