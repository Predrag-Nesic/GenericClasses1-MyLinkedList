package com.company;

public class Cylinder {
    private int r;
    private int h;

    public Cylinder() {

    }

    public Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + r +
                ", h=" + h +
                '}';
    }
}
