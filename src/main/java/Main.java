package main.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException {
        BestPoint bestPoint = new BestPoint();
        List<Sensor> sensorList = bestPoint.readDataSensor();
        HashMap<Point,Integer> map = bestPoint.search(sensorList);
        for(int i=0;i<map.size();i++){
            System.out.println("");
        }
//        GenerateData generateData = new GenerateData();
//        generateData.generateSensor(20,10);
    }
}
