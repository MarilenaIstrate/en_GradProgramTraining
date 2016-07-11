package com.endava.training.examples;

/**
 * Created by mistrate on 7/8/2016.
 */
public class ExtendedSimple extends Simple {

    public ExtendedSimple(){
        System.out.println("\nHello from contructor with no args");

    }

    public ExtendedSimple(int i) {
        System.out.println("Hello from contructor with 1 args");

    }

    public ExtendedSimple(int i, int j) {
        System.out.println("Hello from contructor with 2 args");

    }


}
