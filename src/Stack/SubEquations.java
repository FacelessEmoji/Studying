package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> deque = new ArrayDeque<>();
        int bracketCounter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                deque.addLast(input[i]);
                for (int j = i + 1; j < input.length; j++) {
                    deque.addLast(input[j]);
                    if (input[j].equals("(")) {
                        bracketCounter++;
                    } else if (input[j].equals(")") && (bracketCounter != 0)) {
                        bracketCounter--;
                    } else if (input[j].equals(")") && (bracketCounter == 0)) {
                        System.out.println(deque.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                        deque.clear();
                        break;
                    }
                }
            }
        }
    }
}
