class Sports {
    
    public void play() {
        System.out.println("Playing a sport");
    }
}

class Football extends Sports {

    public void play() {
        System.out.println("Playing Football");
    }
}

class Basketball extends Sports {
 
    public void play() {
        System.out.println("Playing Basketball");
    }
}

class Rugby extends Sports {

    public void play() {
        System.out.println("Playing Rugby");
    }
}

public class SportsTest {
    public static void main(String[] args) {
     
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    }
}
