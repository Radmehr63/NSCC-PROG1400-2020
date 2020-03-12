package Polymorphism.Shapes;

public class Triangle extends Shape {

    public Triangle() {
        lines.add("         * ");
        lines.add("       * * ");
        lines.add("     *   * ");
        lines.add("   *     * ");
        lines.add(" * * * * * ");
    }

    @Override
    public void draw(){
//        System.out.println("         * ");
//        System.out.println("       *   * ");
//        System.out.println("     *       * ");
//        System.out.println("   *           * ");
//        System.out.println(" *   *   *   *   * ");
        for (String line: lines) {
            System.out.println(line);
        }
    }

    @Override
    public void drawLine(int index) {
        if (index >= lines.size()) {
            System.out.print("          ");
        }else {
            System.out.print(lines.get(index));
        }
    }

}
