//Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
//Create two subclasses Car and  Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.

class Vehicle {
    // Method to start the engine of the vehicle
    public void startEngine() {
        System.out.println("The vehicle's engine is starting");
    }

    // Method to stop the engine of the vehicle
    public void stopEngine() {
        System.out.println("The vehicle's engine is stopping");
    }
}

class Car extends Vehicle {
    // Method to start the engine of the car (overrides Vehicle's startEngine method)
    public void startEngine() {
        System.out.println("The car's engine roars to life");
    }

    // Method to stop the engine of the car (overrides Vehicle's stopEngine method)
    public void stopEngine() {
        System.out.println("The car's engine shuts down smoothly");
    }
}

class Motorcycle extends Vehicle {
    // Method to start the engine of the motorcycle (overrides Vehicle's startEngine method)
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a loud vroom");
    }

    // Method to stop the engine of the motorcycle (overrides Vehicle's stopEngine method)
    public void stopEngine() {
        System.out.println("The motorcycle's engine stops with a click");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        // Creating objects of Car and Motorcycle but assigned to Vehicle references
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Testing the Car object
        System.out.println("Car:");
        car.startEngine(); // Calls Car's startEngine method
        car.stopEngine(); // Calls Car's stopEngine method

        // Testing the Motorcycle object
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine(); // Calls Motorcycle's startEngine method
        motorcycle.stopEngine(); // Calls Motorcycle's stopEngine method
    }
}

