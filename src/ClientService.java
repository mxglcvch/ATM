public interface ClientService {
    boolean deposit(OwnerSet balance, double sum);
    boolean withdraw(OwnerSet balance, double sum);
    void showBalance(OwnerSet balance);
}
