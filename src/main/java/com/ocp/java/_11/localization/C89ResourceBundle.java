package com.ocp.java._11.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class C89ResourceBundle {

    public static void main(String[] args) {

        defaultLocaleIrrelevant();
        usingDefaultLocale();
    }

    public static void defaultLocaleIrrelevant(){
        Locale.setDefault(new Locale("en", "IE"));
        Locale localeCA = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("org.javaadvanced.Mill", localeCA);
        System.out.println(rb.getString("name"));
    }

    public static void usingDefaultLocale(){

        Locale.setDefault(new Locale("en", "IE"));
        Locale localeFR = new Locale("fr", "FR");

        ResourceBundle rb = ResourceBundle.getBundle("org.javaadvanced.Mill", localeFR);
        System.out.println(rb.getString("open"));
        System.out.println(rb.getString("name"));
    }
}
