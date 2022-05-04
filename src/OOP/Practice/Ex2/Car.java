package OOP.Practice.Ex2;

public class Car {
    public String make;
    public String model;
    public int horsePower;


    public Car(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String carInfo(){
        String info = String.format("The car is: %s %s - %d HP.",this.make,this.model,this.horsePower);
        return info;
    }
}

