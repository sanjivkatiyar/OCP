package ocp.java._11.localization;

import java.text.DecimalFormat;

public class C86DecimalFormat {

    public static void main(String[] args) {
        double n = 77_000.77;
        System.out.println(new DecimalFormat("$#,###,###.#").format(n));
        System.out.println(new DecimalFormat("$0,000,000.0").format(n));
    }
}
