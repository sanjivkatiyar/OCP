package ocp.java._11.localization;

import java.text.NumberFormat;
import java.util.Locale;

public class C84LocalisingNumbers {

    public static void main(String[] args) {

        double d = 77_000.11;
        System.out.println(NumberFormat.getNumberInstance().format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.ITALY).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.FRANCE).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.GERMANY).format(d));
        System.out.println(NumberFormat.getNumberInstance(Locale.CHINESE).format(d));
    }
}
