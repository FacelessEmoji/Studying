package OOP.Practice.Ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chicken chicken = new Chicken(scanner.nextLine(),Integer.parseInt(scanner.nextLine()));
        if (chicken.ProductPerDay() == 0.75) {
            System.out.println("Chicken " + chicken.getName() + " (age " + chicken.getAge() + ")" +
                    " can produce " + chicken.ProductPerDay() + " eggs per day.");
        } else {
            System.out.println("Chicken " + chicken.getName() + " (age " + chicken.getAge() + ")" +
                    " can produce " + (int) chicken.ProductPerDay() + " eggs per day.");
        }
    }
}
