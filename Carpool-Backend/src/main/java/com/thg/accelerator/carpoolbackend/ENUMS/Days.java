package com.thg.accelerator.carpoolbackend.ENUMS;

public enum Days {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    String day;

    Days(String day) {
        this.day = day;
    }
}
