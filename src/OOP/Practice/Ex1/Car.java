package OOP.Practice.Ex1;

public class Car {
    private String make;
    private String model;
    private int horsePower;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getInfo(){
        String info = String.format("The car is: %s %s - %d HP.",this.make,this.model,this.horsePower);
        return info;
    }

}
