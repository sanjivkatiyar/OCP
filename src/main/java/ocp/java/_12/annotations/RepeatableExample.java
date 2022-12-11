package ocp.java._12.annotations;

import java.lang.annotation.Repeatable;

public class RepeatableExample {

    interface X{}                  // can we define an interface insider a class - Strange

    @interface Batteries{
        Battery[] value();
    }

    @Repeatable(Batteries.class)
    @interface Battery{
        String value();
        boolean recharge() default true;
    }

    @Battery(value="high", recharge=false)
    @Battery(value="high", recharge=false)
    @Battery(value="low", recharge=true)
    //@Batteries(@Battery("loW"))
    class ElectricCar{}
}
