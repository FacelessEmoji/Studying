package OOP.PracticeInheritance.Ex3;

public class Parallelogram extends Quadrilateral{

    public Parallelogram(int[] sides) {
        super(sides);
    }

    @Override
    public String toString() {
        return "Parallelogram contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + dF.format(getPerimeter());
    }
}

