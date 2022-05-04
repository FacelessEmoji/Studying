package OOP.PracticeInheritance.Ex1;

public class Car extends Vehicle {
    private int horsePower;
    private String model;

    public Car(int capacity, int horsePower, String model) {
        super(capacity);
        this.setHorsePower(horsePower);
        this.setModel(model);
    }


    private void setHorsePower(int horsePower) throws IllegalArgumentException{
        if (horsePower<0) {
            throw new IllegalArgumentException("Invalid negative number");
        } else this.horsePower = horsePower;
    }

    private void setModel(String model) {
        if (model.length() < 3) {
            throw new IllegalArgumentException("Invalid short value");
        } else this.model = model;
    }

    @Override
    public String toString() {
        return "In an Car " + capacity + " passengers\n"
                + "With " + horsePower + " horse power on " + model;
    }
}
