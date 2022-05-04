package Files.code.Punctuation;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //2
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String path = "resources//example1.txt";
        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            String[] temp = new String[0];
            String s = "";
            int sum = 0;
            while (scanner.hasNext()) {
                temp = scanner.nextLine().split(" ");
            }
            s = String.join("", temp);
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found on path: " + e.getMessage());
        } catch (IIOException e) {
            System.out.println("Another exception: " + e.getMessage());
        }
    }
}