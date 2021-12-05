package pro.sky.javadev.c2lesson1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mers");
        Car car2 = new Car("BMW");

        Truck truck = new Truck("Volvo", 6);
        Truck truck2 = new Truck("MAZ", 8);

        Bicycle bicycle = new Bicycle("Merida", 3);
        Bicycle bicycle2 = new Bicycle("Cube", 2);

        Vehicle[] transports = new Vehicle[]{
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };
//        Vehicle[] vehicles = {
//                new Car("Mers", 4),
//                new Car2("BMW", 4),
//
//                new Truck("Volvo", 6),
//                new Truck2("MAZ", 8),
//
//                new Bicycle("Merida", 2),
//                new Bicycle2("Cube", 2)
//        };

        ServiceStation station = new ServiceStation();

        for (Vehicle vehicle :
                transports) {
            station.check(vehicle);
        }

    }

}
