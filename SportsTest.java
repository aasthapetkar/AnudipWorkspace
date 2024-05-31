//Write a Java program to create a base class Sports with a method called play(). 
//Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.

class Sports {
    
    // Method to play a generic sport
    public void play() {
        System.out.println("Playing a sport");
    }
}

class Football extends Sports {

    // Method to play football
    public void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports {
 
    // Method to play basketball
    public void play() {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports {

    // Method to play rugby
    public void play() {
        System.out.println("Playing Rugby");
    }
}

public class SportsTest {
    public static void main(String[] args) {
     
        // Creating objects of different sports
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        // Calling the play method for each sport
        football.play();
        basketball.play();
        rugby.play();
    }
}
