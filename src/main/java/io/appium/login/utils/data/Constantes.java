package io.appium.login.utils.data;

public class Constantes {
    public static final String USER_NAME = "userName";
    public static final String PASSWORD = "password";
    public static final String REPEAT_PASSWORD = "repeat password";
    public static final String EMAIL = "email";
    public static final String WELCOME_IONIX = "Welcome to ionix";
    public static final String CREATE_ACCOUNT = "Create an account";

    // Validacion para la expecion en los asserts
    public static final String UN_EXISTENTE = "Username exist";
    public static final String UN_VACIO = "Username vacio";         //reportarlo
    public static final String UN_ARROBA = "Username should not contain @";

    public static final String PW_REQUIRED = "Password is required";
    public static final String PW_FORMAT = "Password does not have the format";

    public static final String RPW_NOT_SAME_FORMAT = "Password and Repeat Password do not have the same format";    //reportarlo

    public static final String EM_FORMAT = "Please enter a valid email";


    public Constantes() {
    }
}