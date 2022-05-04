package OOP.PracticeInheritance.Ex3;

public class Quadrilateral extends Polygon {

    public Quadrilateral(int[] sides) {
        super(sides);
    }

    @Override
    public String toString() {
        return "Quadrilateral contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + dF.format(getPerimeter());
    }
}
