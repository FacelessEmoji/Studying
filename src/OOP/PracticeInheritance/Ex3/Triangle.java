package OOP.PracticeInheritance.Ex3;

public class Triangle extends Polygon {

    public Triangle(int[] sides) {
        super(sides);
    }

    private double getInRadius() {
        double p = getPerimeter() * 0.5;
        return Math.sqrt(
                ((p - sides[0]) * (p - sides[1]) * (p - sides[2])) / p
        );
    }

    @Override
    public String toString() {
        return "Triangle contains " + getSidesCount() + " sides\n" +
                "Its perimeter is " + dF.format(getPerimeter()) +
                "\nIts radius of incircle is " + dF.format(getInRadius());
    }
}
