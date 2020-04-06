package main.java;

public class Sensor {
    private int r;
    private double x;
    private double y;

    public Sensor(int r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
