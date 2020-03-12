package Inheritance.Animals;

public class Mammal extends Animal {
    private boolean breathesAir;

    public void setBreathesAir(boolean breathesAir) {
        log("Changing breathing air from " + this.breathesAir +
                " to " + breathesAir);
        this.breathesAir = breathesAir;
    }

    public boolean getBreathesAir() {
        return breathesAir;
    }

    public Mammal() {
        this.breathesAir = true;
        log("Called no-arg constructor of Mammal.");
    }
}
