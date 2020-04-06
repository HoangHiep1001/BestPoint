package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestPoint {
    public static final int W = 200;
    public static final int H = 100;
    private int velocity;
    private int deltaT;
    private double deltaS = 0.2;
    List<Point> points;
    private Point startPoint;
    private Point endPoint;
    public List<Sensor> readDataSensor(){
        List<Sensor> sensorList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("sensor.txt")))) {
            String line;
            int id = 1;
            while ((line = br.readLine()) != null) {
                String[] coordinatesString = line.split(";");
                Sensor s = new Sensor(Double.parseDouble(coordinatesString[0]),Double.parseDouble(coordinatesString[1]),
                        Double.parseDouble(coordinatesString[2]));
                sensorList.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sensorList;
    }
    public boolean checkCircle(Point point,Sensor s){
        boolean rs = false;
        double check = Math.sqrt(Math.pow((point.getX() - s.getX()),2) + Math.pow((point.getY() - s.getY()),2));
        if(check < s.getR())
            rs = true;
        return rs;
    }
    public int getNum(HashMap<Point,Integer> map,int i,int j){
        int rs = 0;
        if(map.get(new Point(i*deltaS,j*deltaS))!=null)
            rs = map.get(new Point(i*deltaS,j*deltaS));
        return rs;
    }
    public HashMap<Point,Integer> search(List<Sensor> sensors){
        int numPointX = (int) (W/deltaS);
        int numPointY = (int) (H/deltaS);
        HashMap<Point,Integer> map = new HashMap<>();
        for(int i=0;i<numPointX;i++){
            for(int j=0;j<numPointY;j++){
                for(int k=0;k<sensors.size();k++){
                    if(checkCircle(new Point(i*deltaS,j*deltaS),sensors.get(k)))
                        map.put(new Point(i*deltaS,j*deltaS),1 + getNum(map,i,j));
                }
            }
        }
        return map;
    }
}
