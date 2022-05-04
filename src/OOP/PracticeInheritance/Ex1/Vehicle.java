package OOP.PracticeInheritance.Ex1;

public class Vehicle{

    protected int capacity;

    public Vehicle(int capacity) {
        this.setCapacity(capacity);
    }

    protected void setCapacity(int capacity) throws IllegalArgumentException {
        if (capacity<0){
            throw new IllegalArgumentException("Invalid negative number");
        } else if (capacity == 0){
            throw new IllegalArgumentException("Need passengers to drive");
        } else this.capacity = capacity;
    }
}
