package ocp.java._11.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class C85LocalisingCurrencies {

    public static void main(String[] args) {

        double d = 23.33;

        System.out.println(NumberFormat.getCurrencyInstance().format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CANADA).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.FRENCH).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.ITALY).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(d));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(d));

        parseNumbers();
        parseCurrencies();
    }

    public static void parseNumbers(){

        String unitedStatesNumber = "77,000.11";
        String italianNumber = "77.000,11";
        String frenchNumber = "77?000,11";

        try {
            System.out.println(NumberFormat.getNumberInstance(Locale.US).parse(unitedStatesNumber));
            System.out.println(NumberFormat.getNumberInstance(Locale.ITALY).parse(italianNumber));
            System.out.println(NumberFormat.getNumberInstance(Locale.FRANCE).parse(frenchNumber));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseCurrencies(){
        String unitedStatesCurrency = "$23.22";
        try {
            System.out.println(NumberFormat.getCurrencyInstance(Locale.US).parse(unitedStatesCurrency));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
