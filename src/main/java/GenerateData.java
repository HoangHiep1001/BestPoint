package main.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateData {
    Random R = new Random();
    public void generateSensor(int numSensor, int  rMax) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("sensor.txt"));
        for(int i=0;i<numSensor;i++){
            double x = R.nextDouble()*BestPoint.W;
            double y = R.nextDouble()*BestPoint.H;
            double r = R.nextInt(rMax) +1;
            bw.write(x+";"+y+";"+r);
            bw.newLine();
        }
        bw.close();
    }
}
