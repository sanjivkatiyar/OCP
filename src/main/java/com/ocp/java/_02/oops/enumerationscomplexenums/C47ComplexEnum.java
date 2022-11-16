package com.ocp.java._02.oops.enumerationscomplexenums;

public class C47ComplexEnum {
    public static void main(String[] args) {
        WorkDay monday = WorkDay.MONDAY;                    // no String here
        System.out.println(monday.getHoursOfWork() + ", " + monday.getWorkLocation());
        System.out.println(WorkDay.SUNDAY.getHoursOfWork()+", "+WorkDay.SUNDAY.getWorkLocation());
    }
}

enum WorkDay{
    // values must be first
    MONDAY("9-5"),                                // constructor call
    TUESDAY("9-5"),
    WEDNESDAY("9-5"),
    THURSDAY("9-5"),
    FRIDAY("9-5"),
    SATURDAY("10-1"){
        public String getWorkLocation(){return "Home";}
    },
    SUNDAY("10-1"){
        public String getWorkLocation(){return "Home";}
    };                                                      // ; is required at end

    private final String hoursOfWork;                       // immutable

    private WorkDay(String hoursOfWork){                    // constructor
        this.hoursOfWork = hoursOfWork;
    }

    public String getHoursOfWork(){return hoursOfWork;}
    public String getWorkLocation(){return "Office";}
}
