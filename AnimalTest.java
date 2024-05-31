//Write a Java program to create a base class Animal with methods move() and makeSound(). 
//Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. 
//Also, override the makeSound() method in each subclass to make a specific sound for each animal.
// Base class Animal
class Animal {
 
    // Method to describe movement
    public void move() {
        System.out.println("The animal moves");
    }

    // Method to describe sound
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Derived class Bird, extends Animal
class Bird extends Animal {

    // Override move method for Bird
    public void move() {
        System.out.println("The bird flies");
    }

    // Override makeSound method for Bird
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}

// Derived class Panthera, extends Animal
class Panthera extends Animal {
    
    // Override move method for Panthera
    public void move() {
        System.out.println("The panthera prowls");
    }

    // Override makeSound method for Panthera
    public void makeSound() {
        System.out.println("The panthera roars");
    }
}

// Test class with main method
public class AnimalTest {
    public static void main(String[] args) {
        
        // Create an Animal reference pointing to a Bird object
        Animal bird = new Bird();
        // Create an Animal reference pointing to a Panthera object
        Animal panthera = new Panthera();
        
        // Call move and makeSound methods on bird reference
        bird.move();          // This will call Bird's move method
        bird.makeSound();     // This will call Bird's makeSound method

        // Call move and makeSound methods on panthera reference
        panthera.move();      // This will call Panthera's move method
        panthera.makeSound(); // This will call Panthera's makeSound method
    }
}
