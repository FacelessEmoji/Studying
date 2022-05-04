package OOP.PracticeInheritance.Ex1;

public class Boat extends Vehicle {
    private int oarsCount;

    public Boat(int capacity, int oarsCount) {
        super(capacity);
        this.setOarsCount(oarsCount);
    }

    private void setOarsCount(int oarsCount) throws IllegalArgumentException{
        if (oarsCount<0) {
            throw new IllegalArgumentException("Invalid negative number");
        } else if (oarsCount > 2*this.capacity){
            throw new IllegalArgumentException("One too many oars");
        } else this.oarsCount = oarsCount;
    }

    @Override
    public String toString() {
        if (oarsCount == 0) {
            return "Need oars to swim";
        }
        return "In a Boat " + capacity + " passengers\n"
                + "With " + oarsCount + " oars";
    }
}
