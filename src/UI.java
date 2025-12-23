import java.util.Scanner;

public class UI {
    private OwnerSet customer;
    private TransactionMethods service = new TransactionMethods();
    private Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.print("-----------------------------------------------\n Введите ФИО держателя счета: ");
        String name = scan.nextLine();
        double balance = 0;

        customer = new OwnerSet(name, balance);


        System.out.println("Счет успешно создан.");
        service.showAccount(customer);

        showMenu();
    }

    private void showMenu() {
        while (true) {

            System.out.println("-------------------------------------------");
            System.out.println("МЕНЮ ПРОГРАММЫ");
            System.out.println("1. Внести денежные средства");
            System.out.println("2. Вывод денежных средств");
            System.out.println("3. Показать баланс");
            System.out.println("4. Выход");
            System.out.print("Ваш выбор: ");

            byte choice = scan.nextByte();

            switch (choice) {
                case 1: {
                    deposit();
                    break;
                }
                case 2: {
                    withdraw();
                    break;
                }
                case 3: {
                    service.showBalance(customer);
                    break;
                }
                case 4: {
                    System.out.println("До свидания, " + customer.getName() + ".");
                    return;
                }
                default: {
                    System.out.println("Неккоректный ввод. \n");
                    break;
                }
            }
        }
    }

    private void withdraw() {
        System.out.print("\nВведите сумму(RUB): ");
        double sum = scan.nextDouble();
        if (service.withdraw(customer, sum)) {
            System.out.println("Операция успешна. Снятие " + sum + " RUB.\n");
        } else {
            System.out.println("Операция отклонена: недостаточно средств или неверная сумма вывода\n");
        }
    }
    private void deposit() {
        System.out.print("\nВведите сумму(RUB): ");
        double sum = scan.nextDouble();
        if (service.deposit(customer, sum)) {
            System.out.println("Операция успешна. Пополнение "+ sum + " RUB.\n");
        }
        else {
            System.out.println("Сумма должна быть положительной.\n");
        }
    }

}

