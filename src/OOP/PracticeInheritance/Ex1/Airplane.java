package OOP.PracticeInheritance.Ex1;

import java.util.Arrays;

public class Airplane extends Vehicle {
    private static final int[] enginesNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12};
    private int wingsCount;
    private int enginesNumber;
    private boolean isHydroplane;

    public Airplane(int capacity, int wingsCount, int enginesNumber, boolean isHydroplane) {
        super(capacity);
        this.setWingsCount(wingsCount);
        this.setEnginesNumber(enginesNumber);
        this.setHydroplane(isHydroplane);
    }

    private void setWingsCount(int wingsCount) throws IllegalArgumentException {
        if (wingsCount < 0) {
            throw new IllegalArgumentException("Invalid negative number");
        } else if (wingsCount == 0) {
            throw new IllegalArgumentException("Need wings to fly");
        } else this.wingsCount = wingsCount;
    }

    private void setEnginesNumber(int enginesNumber) throws IllegalArgumentException {
        if (enginesNumber < 0) {
            throw new IllegalArgumentException("Invalid negative number");
        } else if (Arrays.asList(enginesNumbers).contains(enginesNumber)) {
            throw new IllegalArgumentException("Invalid engines number");
        } else this.enginesNumber = enginesNumber;
    }

    private void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }

    @Override
    public String toString() {
        if (isHydroplane) {
            return "In a Hydroplane " + capacity + " passengers\n"
                    + "With " + wingsCount + " wings and " + enginesNumber + " engines";
        }
        return "In an Airplane " + capacity + " passengers\n"
                + "With " + wingsCount + " wings and " + enginesNumber + " engines";

    }
}
