package main.java;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        BestPoint bestPoint = new BestPoint();
        List<Point> pointList = bestPoint.readData();
        Double totalExposure = bestPoint.search(pointList);
        System.out.println(totalExposure);
    }
}
