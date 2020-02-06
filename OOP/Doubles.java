package OOP;

import java.util.Random;
import java.util.Scanner;

class Die {
    int value;

    public void roll(){
        Random random = new Random();
        value = random.nextInt(6) + 1;
    }
}


public class Doubles {

    public static void main(String[] args) {

        DoublesGame game = new DoublesGame();
        game.run();
    }

}