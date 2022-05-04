package OOP.Practice.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList();
        int cars_number = Integer.parseInt(scanner.nextLine());
        String input = "";
        for (int i = 0; i < cars_number; i++) {
            input = scanner.nextLine();
            cars.add(new Car(input.split(" ")[0], input.split(" ")[1], Integer.parseInt(input.split(" ")[2])));
        }
        for(Car car:cars){
            System.out.println(car.carInfo());
        }
    }
}
