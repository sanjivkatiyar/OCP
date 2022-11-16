package com.ocp.java._11.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class C88LocaleCategories {

    public static void main(String[] args) {

        double n = 77_000.11;
        Locale locFrench = new Locale("fr", "FR");

        Locale defaultLocale = Locale.getDefault();

        System.out.println(defaultLocale.getDisplayName());
        System.out.println(defaultLocale.getDisplayLanguage());
        System.out.println(defaultLocale.getDisplayCountry());
        System.out.println(defaultLocale.getDisplayScript());
        System.out.println(NumberFormat.getInstance().format(n));

        Locale.setDefault(Locale.Category.DISPLAY, locFrench);

        System.out.println(defaultLocale.getDisplayName());
        System.out.println(defaultLocale.getDisplayLanguage());
        System.out.println(defaultLocale.getDisplayCountry());
        System.out.println(defaultLocale.getDisplayScript());
        System.out.println(NumberFormat.getInstance().format(n));

        Locale.setDefault(Locale.Category.FORMAT, locFrench);

        System.out.println(NumberFormat.getInstance().format(n));

    }
}
