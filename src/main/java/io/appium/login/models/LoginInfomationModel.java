package io.appium.login.models;

public enum LoginInfomationModel {
    LOGIN("ionixtester", "Password#1", "Password#1", "abel.gutierrezarias@outlook.com");

    private final String userName;
    private final String passWord;
    private final String repeatPassWord;
    private final String email;

    LoginInfomationModel(String userName, String passWord, String repeatPassWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.repeatPassWord = repeatPassWord;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRepeatPassWord() {
        return repeatPassWord;
    }

    public String getEmail() {
        return email;
    }
}