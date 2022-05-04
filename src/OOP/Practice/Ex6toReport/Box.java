package OOP.Practice.Ex6toReport;

    public class Box {
        private double length;
        private double width;
        private double height;

        public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
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
