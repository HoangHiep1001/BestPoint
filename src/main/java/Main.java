package main.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
    public static void main(String[] args) throws IOException {
        BestPoint bestPoint = new BestPoint();
        List<Sensor> sensorList = bestPoint.readDataSensor();
        HashMap<Point,Integer> map = bestPoint.search(sensorList);
        for (Map.Entry<Point, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey().toString()+" : "+entry.getValue());
        }
//        GenerateData generateData = new GenerateData();
//        generateData.generateSensor(20,10);
    }
}
