package com.endava.training.examples;

/**
 * Created by mistrate on 7/10/2016.
 */
public class B extends A {


    @Override
    public void f(){System.out.println("\nHello from B");}
    public void f(int i){System.out.println("Hello from B - 1 arg");}
    public void f(int i, int j){System.out.println("Hello from B - 2 arg");}
}
