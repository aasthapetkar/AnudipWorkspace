class Vehicle {
   
    public void startEngine() {
        System.out.println("The vehicle's engine is starting");
    }

    public void stopEngine() {
        System.out.println("The vehicle's engine is stopping");
    }
}

class Car extends Vehicle {
  
    public void startEngine() {
        System.out.println("The car's engine roars to life");
    }

    public void stopEngine() {
        System.out.println("The car's engine shuts down smoothly");
    }
}

class Motorcycle extends Vehicle {
    
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a loud vroom");
    }

    public void stopEngine() {
        System.out.println("The motorcycle's engine stops with a click");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();
        
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

