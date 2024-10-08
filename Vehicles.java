package javaPrograms2;

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Driving a car");
    }
}

public class Vehicles {
    public static void main(String[] args) {
       
        Car car = new Car();
        car.drive(); 
    }
}

