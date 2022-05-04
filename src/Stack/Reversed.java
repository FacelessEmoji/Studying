package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i : input) {
            deque.addFirst(i);
        }
        System.out.println(deque.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
