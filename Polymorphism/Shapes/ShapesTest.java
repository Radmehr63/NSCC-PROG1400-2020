package Polymorphism.Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Square s1 = new Square(5);
//        s1.draw();
//        System.out.println("------------------------------");

        Triangle t1 = new Triangle();
//        t1.draw();
//        System.out.println("------------------------------");

        Diamond d1 = new Diamond();
//        d1.draw();
//        System.out.println("------------------------------");

        Shape[] shapes = {s1, t1, d1};

//        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
//            System.out.println("===============================");
//        }

//        for (Shape shape: shapes) {
//            shape.draw();
//            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        }

        for (int i = 0; i < 10; i++) {
            for (Shape shape: shapes) {
                shape.drawLine(i);
            }
            System.out.println();
        }
        System.out.println();
    }

}
