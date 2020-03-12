package Polymorphism.Shapes;

public class Diamond extends Shape {

    public Diamond() {
        lines.add("         *         ");
        lines.add("       *   *       ");
        lines.add("     *       *     ");
        lines.add("   *           *   ");
        lines.add(" *               * ");
        lines.add("   *           *   ");
        lines.add("     *       *     ");
        lines.add("       *   *       ");
        lines.add("         *         ");
    }

    @Override
    public void draw(){
//        System.out.println("         * ");
//        System.out.println("       *   * ");
//        System.out.println("     *       * ");
//        System.out.println("   *           * ");
//        System.out.println(" *               * ");
//        System.out.println("   *           * ");
//        System.out.println("     *       * ");
//        System.out.println("       *   * ");
//        System.out.println("         * ");
        for (String line: lines) {
            System.out.println(line);
        }
    }

    @Override
    public void drawLine(int index) {
        if (index >= lines.size()) {
            System.out.print("                ");
        }else {
            System.out.print(lines.get(index));
        }
    }

}
