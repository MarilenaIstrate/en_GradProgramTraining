package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mistrate on 7/8/2016.
 */
public class Square implements Shape2D {

    private double l;
    private int x,y;

    public Square(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }


    public double computeArea(){
        double aria;

        aria = l*l;
        return aria;
    }

    public double computePerimeter(){
        double p;

        p = 4*l;
        return p;
    }

}
