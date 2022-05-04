package OOP.Practice.Ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scanner = new Scanner(System.in);
        Box box = new Box(Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()),Double.parseDouble(scanner.nextLine()));
        System.out.println("Surface Area - " + String.format("%.2f",box.calculateSurfaceArea()));
        System.out.println("Lateral Surface Area - " + String.format("%.2f",box.calculateLateralSurfaceArea()));
        System.out.println("Volume - " + String.format("%.2f",box.calculateVolume()));
    }
}
