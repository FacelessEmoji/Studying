package OOP.Practice.Ex5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_people = Integer.parseInt(scanner.nextLine());
        List <Person> people = new ArrayList<>();
        String input = "";
        for (int i = 0; i < number_of_people; i++) {
            input = scanner.nextLine();
            people.add(new Person(input.split(" ")[0],Integer.parseInt(input.split(" ")[1])));
        }
        people.stream().filter(person -> person.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

    }
}
