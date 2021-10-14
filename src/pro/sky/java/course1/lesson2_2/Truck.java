package pro.sky.java.course1.lesson2_2;

public class Truck extends Vehicles{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Vehicles vehicles){System.out.println("Обслуживаем2 " + vehicles.getModelName());
        for (int i = 0; i < vehicles.getWheelsCount(); i++) {
            vehicles.updateTyre();
        }
        vehicles.checkEngine();
        vehicles.checkTrailer();}
}
