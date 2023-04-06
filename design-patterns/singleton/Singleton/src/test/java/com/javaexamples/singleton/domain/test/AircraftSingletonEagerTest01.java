package com.javaexamples.singleton.domain.test;

import com.javaexamples.singleton.domain.Aircraft;
import com.javaexamples.singleton.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {


    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
