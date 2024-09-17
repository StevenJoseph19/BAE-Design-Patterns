package org.example5;

class Owner {


    Car car;

    Owner(Car car) {
        this.car = car;
    }

    void startCar() {
        car.start();
    }

//    void startCar() {
//        car.engine.start();// Violation: Reaching deep into the Car object to access the Engine object's start() method
//    }
}

class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

//    public void start() {
//        engine.start();
//    }

    public void start() {
        engine.start();
    }
}

class Engine {


    void start() {
        System.out.println("Engine started");
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        Owner owner = new Owner(car);

        owner.startCar(); // Calls the start() method on the Car object
    }
}
