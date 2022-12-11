package ocp.java._11.localization;

import java.util.Locale;

public class C83CreatingLocales {

    public static void main(String[] args) {

        // 1. Constructors
        System.out.println(new Locale("en"));
        Locale locEnglishGB = new Locale("en", "GB");
        System.out.println(locEnglishGB.getDisplayLanguage());
        System.out.println(locEnglishGB.getDisplayCountry());

        // 2. Built-in constants
        System.out.println(Locale.FRENCH);
        System.out.println(Locale.FRANCE);
        Locale locFrenchFrance = Locale.FRANCE;
        System.out.println(locFrenchFrance.getDisplayLanguage());
        System.out.println(locFrenchFrance.getDisplayCountry());

        // 3. Locale.Builder() pattern
        Locale locArabicEgypt = new Locale.Builder()
                .setLanguage("ar")
                .setRegion("EG")
                .build();
        System.out.println(locArabicEgypt);
        new Builder().build();
    }

    public static final class Builder{
        public Builder(){}
        public void build(){
            System.out.println("I am building something..");
        }
    }
}
