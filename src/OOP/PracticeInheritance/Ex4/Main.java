package OOP.PracticeInheritance.Ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Hero hero = null;
        while (!input.split(" ")[0].equals("End")) {
            if (input.split(" ")[0].equals("Create")) {
                if (input.split(" ")[1].equals("Wizard")) {
                    hero = new Wizard((
                            input.split(" ")[2]),
                            Integer.parseInt(input.split(" ")[3]),
                            Integer.parseInt(input.split(" ")[4]),
                            Integer.parseInt(input.split(" ")[5])
                    );
                    System.out.println(hero + "online");
                } else if (input.split(" ")[1].equals("Knight")) {
                    hero = new Knight((
                            input.split(" ")[2]),
                            Integer.parseInt(input.split(" ")[3]),
                            Integer.parseInt(input.split(" ")[4]),
                            Integer.parseInt(input.split(" ")[5])
                    );
                    System.out.println(hero + "online");

                } else if (input.split(" ")[1].equals("Elf")) {
                    hero = new Elf((
                            input.split(" ")[2]),
                            Integer.parseInt(input.split(" ")[3]),
                            Integer.parseInt(input.split(" ")[4])
                    );
                    System.out.println(hero + "online");
                }
            } else if (input.split(" ")[0].equals("Action")) {
                System.out.println(hero.action());

            }
            input = scanner.nextLine();
        }
        System.out.println(hero + "offline");
    }
}
