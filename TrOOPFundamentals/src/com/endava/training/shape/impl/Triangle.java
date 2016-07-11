package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by mistrate on 7/8/2016.
 */
public class Triangle implements Shape2D {

    private float l1,l2,l3;
    private int x,y;

    public Triangle(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public float getL1() {
        return l1;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public float getL2() {
        return l2;
    }

    public void setL2(float l2) {
        this.l2 = l2;
    }

    public float getL3() {
        return l3;
    }

    public void setL3(float l3) {
        this.l3 = l3;
    }


    public double computeArea( ){
        double sp, aria;

        sp = (l1+l2+l3)/3;
        aria = Math.sqrt(sp*(sp - l1)*(sp - l2)*(sp - l3));
        return aria;

    }

    public double computePerimeter(){
        double p;

        p = l1 + l2 + l3;
        return p;
    }

}
