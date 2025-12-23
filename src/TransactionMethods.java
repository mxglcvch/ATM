import java.util.Scanner;

public class TransactionMethods implements ClientService {

    Scanner scan = new Scanner(System.in);

    public boolean withdraw(OwnerSet customer,double sum)
    {

        if (sum > customer.getBalance())
        {
            return false;
        }
        if (sum <= 0) {
            return false;
        }
            else {
            customer.balanceChange(customer.getBalance() - sum);
            return true;
        }
    }

    public boolean deposit(OwnerSet customer, double sum)
    {

        if (sum <= 0)
        {
            return false;
        }
        else
        {
            customer.balanceChange(customer.getBalance() + sum);
            return true;
        }
    }

    public void showBalance(OwnerSet customer)
    {
        System.out.println("Баланс: " + customer.getBalance() + " RUB.\n");
    }

    public void showAccount(OwnerSet customer)
    {
        System.out.println("Владелец счета: " + customer.getName());
        System.out.println("Баланс: " + customer.getBalance() + " RUB.\n");
    }
}
