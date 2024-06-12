import processing.core.PApplet;
import java.util.ArrayList;
import Map.Car;
public class Map extends PApplet {
    ArrayList<Car> carsOnMap;
    String [] carBrands= {"toyota", "honda", "nissan", "mazda", "acura", "ford", "bmw", "tesla"};
    @Override
    public void setup() {
        carsOnMap= new ArrayList<>();
        //TODO add cars to the list


    }

    @Override
    public void settings() {
        size(600,600);
    }


    @Override
    public void draw() {
        background(0);
        for (int i = 0; i < carsOnMap.size(); i++) {
            for (int j = i+1; j <carsOnMap.size() ; j++) {
                Car currentCar= carsOnMap.get(i);

            }
            //TODO add whatever operations should happen every time we run the simulation
        }
    }


    public static void run() {
        PApplet.main("Map");
    }
}
