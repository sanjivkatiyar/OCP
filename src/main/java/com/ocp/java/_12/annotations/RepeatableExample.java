package com.ocp.java._12.annotations;

import java.lang.annotation.Repeatable;

public class RepeatableExample {

    interface X{}                  // can we define an interface insider a class - Strange

    @interface Batteries{
        Battery[] value();
    }

    @Repeatable(Batteries.class)
    @interface Battery{
        String level();
        boolean recharge();
    }

    @Battery(level="high", recharge=false)
    @Battery(level="low", recharge=true)
    class ElectricCar{}
}
