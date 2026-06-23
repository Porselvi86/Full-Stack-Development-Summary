package typesofinheritance;
class Vehicle {
    void cars() {
        System.out.println("Show traffic");
    }
}

class Car extends Vehicle {
    void Size() {
        System.out.println("four seater");
    }
}

class Bike extends Vehicle {
    void gear() {
        System.out.println("gear sound");
    }
}

public class Hierarchicalvehicle   {

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.cars();
        c.Size();

        b.cars();
        b.gear();
    }
}

