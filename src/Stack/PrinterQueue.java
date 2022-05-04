package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> printerQueue= new ArrayDeque<>();
        while (input != null && !input.isEmpty()){
            if (input.equals("cancel")){
                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                } else System.out.println("Cancelled " + printerQueue.poll());
            } else if (input.equals("print")){
                while (!printerQueue.isEmpty()) {
                    System.out.println(printerQueue.poll());
                }
            } else printerQueue.addLast(input);
            input = scanner.nextLine();
        }
    }
}
