package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BestPoint {
    private int W;
    private int H;
    private int velocity;
    private int time;
    private int r_sensor;
    List<Point> points;
    private Point startPoint;
    private Point endPoint;
    public List<Point> readData(){
        List<Point> pointList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("input.txt")))) {
            String line;
            int id = 1;
            while ((line = br.readLine()) != null) {
                String[] coordinatesString = line.split(";");
                Point p = new Point(id++,Integer.parseInt(coordinatesString[0]),
                        Integer.parseInt(coordinatesString[1]));
                pointList.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pointList;
    }
    public double search(List<Point> points){
        double rs = 0;
        
        return rs;
    }
}
