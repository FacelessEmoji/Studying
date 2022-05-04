package OOP.PracticeInheritance.Ex3;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Polygon {
    DecimalFormat dF = new DecimalFormat( "0.00" );
    protected int[] sides;

    public Polygon(int[] sides) throws IllegalArgumentException{
        if(sides.length > 2 && (Arrays.stream(sides).max().getAsInt() > (Arrays.stream(sides).sum()) - Arrays.stream(sides).max().getAsInt())) {
            throw new
                    IllegalArgumentException("Wrong value to side length " + Arrays.stream(sides).max().getAsInt());
        }else this.sides = sides;
        for (int side: sides) {
            if (side <= 0 ){
                throw new IllegalArgumentException("Negative value to side length " + side);
            }
        }
    }

    protected int getSidesCount(){
        return sides.length;
    }

    protected double getPerimeter(){
        int perimeter = 0;
        for (int side: sides) {
           perimeter += side;
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return "Polygon contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + dF.format(getPerimeter());
    }
}
