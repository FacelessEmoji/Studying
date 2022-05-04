package OOP.PracticeInheritance.Ex3;

import java.text.DecimalFormat;

public class Circle extends Polygon{
    DecimalFormat dF = new DecimalFormat( "0.00" );

    public Circle(int[] sides) {
        super(sides);
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * sides[0];
    }

    private double getArea(){
        return Math.PI * Math.pow(sides[0],2);
    }

    @Override
    public String toString() {
        return "Circle radius is " + sides[0] +
                "\nIts perimeter is " + dF.format(getPerimeter()) +
                "\nIts area is " + dF.format(getArea());
    }
}
