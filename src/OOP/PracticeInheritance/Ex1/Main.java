package OOP.PracticeInheritance.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicle = scanner.nextLine();
        if (vehicle.split(" ")[0].equals("Car")){
            System.out.println(new Car(Integer.parseInt(vehicle.split(" ")[1])
                    ,Integer.parseInt(vehicle.split(" ")[2]),vehicle.split(" ")[3]));
        } else if (vehicle.split(" ")[0].equals("Boat")){
            System.out.println(new Boat(Integer.parseInt(vehicle.split(" ")[1])
                    ,Integer.parseInt(vehicle.split(" ")[2])));
        } else if (vehicle.split(" ")[0].equals("Airplane")) {
            System.out.println( new Airplane(Integer.parseInt(vehicle.split(" ")[1]),
                    Integer.parseInt(vehicle.split(" ")[2]),
                    Integer.parseInt(vehicle.split(" ")[3]),
                    Boolean.parseBoolean(vehicle.split(" ")[4])));
        }
    }
}
