package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        ArrayDeque<String> firstPart = new ArrayDeque<>();
        ArrayDeque<String> secondPart = new ArrayDeque<>();
        boolean flag = true;
        if (input.length / 2 == 0) System.out.println("NO");
        for (int i = 0; i < input.length / 2; i++) {
            firstPart.addFirst(input[i]);
        }
        for (int i = input.length / 2 ; i < input.length ; i++) {
            if (input[i].equals(")")){
                secondPart.addLast("(");
            } else if (input[i].equals("}")){
                secondPart.addLast("{");
            } else if (input[i].equals("]")){
                secondPart.addLast("[");
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        /* System.out.println(String.join(" ", firstPart));
        System.out.println(String.join(" ", secondPart));*/
        while (!firstPart.isEmpty()){
            if (!firstPart.poll().equals(secondPart.poll())){
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");
    }
}
