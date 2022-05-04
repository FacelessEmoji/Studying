package OOP.PracticeInheritance.Ex2;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        String worker = scanner.nextLine();
        System.out.println(new Student(student.split(" ")[0],
                student.split(" ")[1],
                student.split(" ")[2]));
        System.out.println(new Worker(worker.split(" ")[0],
                worker.split(" ")[1],
                Double.parseDouble(worker.split(" ")[2]),
                Double.parseDouble(worker.split(" ")[3])));
    }
}
