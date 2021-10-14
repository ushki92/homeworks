package pro.sky.java.course1.lesson2_2;

public class Car extends Vehicles{

    protected Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    protected void check(Vehicles vehicles) {
        for (int i = 0; i < vehicles.getWheelsCount(); i++) {
            vehicles.updateTyre();
        }
        vehicles.checkEngine();
        vehicles.checkTrailer();}

    }


