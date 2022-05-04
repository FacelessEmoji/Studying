package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TenToDuo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (number > 0){
            deque.addFirst(number % 2);
            number/=2;
        }
        System.out.println(deque.stream().map(String::valueOf).collect(Collectors.joining("")));
    }
}
