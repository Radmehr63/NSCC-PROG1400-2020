package Polymorphism.Shapes;

public class Square extends Shape {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < width-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
