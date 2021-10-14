package pro.sky.java.course1.lesson2_2;

public class Main {
    public static void main(String[] args) {

        Vehicles[] vehicles = new Vehicles[] {
                new Car("car 1", 4),
                new Car("car 2", 4),
                new Truck("truck 1", 6),
                new Truck("truck 2", 8),
                new Bicycle("bicycle 1", 2),
                new Bicycle("bicycle 2", 2),
        };


        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].check(vehicles[i]);
        }
}
}
