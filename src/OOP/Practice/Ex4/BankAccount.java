package OOP.Practice.Ex4;

public class BankAccount {
    private int id;
    private double balance;
    public final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;


    public BankAccount(double balance) {
        this.id = bankAccountCount++;
        this.balance = balance;
        System.out.printf("Account ID%s created\n",this.id);
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    void deposit(double amount) {
        this.balance += amount;
        if (amount == (int) amount) {
            System.out.printf("Deposited %s to ID%s\n", (int) amount, this.id);
        } else {
            System.out.printf("Deposited %s to ID%s\n", amount, this.id);
        }
    }


    double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }
}
