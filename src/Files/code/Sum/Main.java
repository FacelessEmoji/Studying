package Files.code.Sum;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //3
    public static void main(String[] args) throws IOException {
        String path = "resources//example1.txt";
        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            String[] temp = new String[0];
            String s;
            while (scanner.hasNext()) {
                temp = scanner.nextLine().split(" ");
            }
            s = String.join("", temp);
            System.out.println(s.length());
        } catch (FileNotFoundException e) {
            System.out.println("File not found on path: " + e.getMessage());
        } catch (IIOException e) {
            System.out.println("Another exception: " + e.getMessage());
        }
    }
}