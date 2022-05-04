package OOP.Practice.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList();
        int cars_number = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < cars_number; i++){
            String input = scanner.nextLine();
            Car car = new Car();
            car.setMake(input.split(" ")[0]);
            car.setModel(input.split(" ")[1]);
            car.setHorsePower(Integer.parseInt(input.split(" ")[2]));
            System.out.println(car.getInfo());

        }
    }
}