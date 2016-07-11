package com.endava.training;

import com.endava.training.shape.impl.*;
import com.endava.training.examples.*;

/**
 * Created by mistrate on 7/8/2016.
 */
public class main {

    public static void main(String[] args){
        System.out.println("Hello OOP! \n");

        Circle cr = new Circle(5);
        double ariaCr = cr.computeArea();
        System.out.println("Aria cercului este: "+ ariaCr);

        double pCr = cr.computePerimeter();
        System.out.println("Perimetrul cercului este: " + pCr);

       Square sq = new Square(6);
        double ariaSq = sq.computeArea();
        System.out.println("\nAria patratului este: " + ariaSq);

        double pSq = sq.computePerimeter();
        System.out.println("Perimetrul patratului este:  " + pSq);

        Triangle tr = new Triangle(2,7,5);
        double ariaTr = tr.computeArea();
        System.out.println("\nAria triunghiului este:" + ariaTr);

        double pTr = tr.computePerimeter();
        System.out.println("Perimetrul triunghiului este: " + pTr);


        Simple s = new Simple();
        ExtendedSimple exS = new ExtendedSimple();
        exS = new ExtendedSimple(1);
        exS = new ExtendedSimple(2,3);




        //First scenario
       //A a = new B();
       // a.f();
       // a.f(1);
       // a.f(1,2);

        //Second scenario
        B b = new C();
        b.f();
        b.f(2);

        //Third scenario
        A a = new C();
        a.f();



    }
}
