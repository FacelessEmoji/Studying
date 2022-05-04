package Files.code.Solving;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "resources//example2.txt";
        int result = 0;
        try (FileReader reader = new FileReader(path);
             Scanner scanner = new Scanner(reader)) {
            String[] temp = new String[0];
            while (scanner.hasNext()) {
                temp = scanner.nextLine().split("/");
            }
            result = Integer.parseInt(temp[0])/Integer.parseInt(temp[1]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found on path: " + e.getMessage());
        } catch (IIOException e) {
            System.out.println("Another exception: " + e.getMessage());
        }
        try (FileWriter writer = new FileWriter(path,true)){
            writer.write("=" + result);
            writer.flush();
        } catch (IIOException e) {
            System.out.println("Another exception: " + e.getMessage());
        }
    }
}
