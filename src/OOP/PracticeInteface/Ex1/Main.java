package OOP.PracticeInteface.Ex1;

public class Main {
    public static void main(String[] args) {
        Car audi = new Audi("R8","gray",510,"Spain");

        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                audi.getModel(),
                audi.getColor(),
                audi.getHorsePower()));
        System.out.println(audi.toString());
    }
}
