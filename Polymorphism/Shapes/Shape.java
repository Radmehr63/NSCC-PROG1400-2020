package Polymorphism.Shapes;

import java.util.ArrayList;

public abstract class Shape {

    protected String colour;
    protected ArrayList<String> lines = new ArrayList<String>();

    public abstract void draw();
    public abstract void drawLine(int index);

}

