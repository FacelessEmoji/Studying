package OOP.Practice.Ex6;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length > 0){
            this.length = length;
        } else {
            System.out.println("Length cannot be zero or negative.");
            System.exit(0);
        }
    }

    private void setWidth(double width) {
        if (width > 0){
            this.width = width;
        } else {
            System.out.println("Width cannot be zero or negative.");
            System.exit(0);
        }
    }

    private void setHeight(double height) {
        if (height > 0){
            this.height = height;
        } else {
            System.out.println("Height cannot be zero or negative.");
            System.exit(0);
        }
    }

    public double calculateSurfaceArea(){
        return 2 * (this.length * this.width + this.length * this.height + this.width * this.height);
    }
    public double calculateLateralSurfaceArea(){
        return 2 * this.height * (this.length + this.width);
    }
    public double calculateVolume(){
        return this.length*this.width*this.height;
    }
}
