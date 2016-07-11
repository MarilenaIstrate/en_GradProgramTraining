package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mistrate on 7/8/2016.
 */
public class Circle implements Shape2D {

    private double r;
    private int x,y;

    public Circle(){};

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double computeArea(){
        double aria;

        aria = Math.PI*r*r;
        return aria;

    }

    public double computePerimeter(){
        double p;

        p = 2*Math.PI*r;
        return p;
    }


}
