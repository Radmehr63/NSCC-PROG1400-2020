package OOP;

import java.util.Random;

public class Die {
    private int value;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void roll(){
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }
}
