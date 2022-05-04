package OOP.PracticeInheritance.Ex3;

public class Rhombus extends Quadrilateral{

    public Rhombus(int[] sides) {
        super(sides);
    }

    @Override
    public String toString() {
        return "Rhombus contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + dF.format(getPerimeter());
    }
}
