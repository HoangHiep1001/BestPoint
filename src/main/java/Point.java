package main.java;

public class Point {
    private double x;
    private double y;
    private int num;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(double x, double y,int num){
        this.num= num;
        this.x = x;
        this.y = y;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
