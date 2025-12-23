import java.util.Scanner;

public class OwnerSet {
    private String name;
    private double balance = 0;
    private Scanner scan = new Scanner(System.in);



    public OwnerSet(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    void balanceChange(double newBalance)
    {
        this.balance = newBalance;
    }
}
