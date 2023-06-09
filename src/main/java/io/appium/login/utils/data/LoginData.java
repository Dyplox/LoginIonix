package io.appium.login.utils.data;

import java.util.HashMap;
import java.util.Map;

public class LoginData {
    private static Map<String, Object> map = new HashMap<>();

    public static Map<String, Object> getData() {
        return map;
    }

    public static void setData(Map<String, Object> testData) {
        map = testData;
    }

    public LoginData() {
    }
}