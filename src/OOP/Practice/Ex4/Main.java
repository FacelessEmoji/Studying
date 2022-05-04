package OOP.Practice.Ex4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));*/
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<BankAccount> accounts = new ArrayList<>();
        while (!input.equals("End")) {
            if (input.split(" ")[0].equals("Create")) {
                accounts.add(new BankAccount(0));
            } else if (input.split(" ")[0].equals("Deposit")) {
                try {
                    (accounts.get(Integer.parseInt(input.split(" ")[1]) - 1)).deposit(Double.parseDouble(input.split(" ")[2]));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Account does not exist");
                }
            } else if (input.split(" ")[0].equals("SetInterest")) {
                BankAccount.setInterestRate(Double.parseDouble(input.split(" ")[1]));
            } else if (input.split(" ")[0].equals("GetInterest")) {
                try{
                    (accounts.get(Integer.parseInt(input.split(" ")[1]) - 1)).getInterest(Integer.parseInt(input.split(" ")[1]));
                    System.out.println((accounts.get(Integer.parseInt(input.split(" ")[1]) - 1)).getInterest(Integer.parseInt(input.split(" ")[1])));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Account does not exist");
                }
            }
            input = scanner.nextLine();
        }
    }
}
