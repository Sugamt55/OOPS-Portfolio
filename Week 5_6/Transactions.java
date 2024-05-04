package Week5_6;

public class Transactions {
    public static void main(String[] args) {
        // Demonstrate creating an account with initial balance
        Account account1 = new Account("John Doe", 1234567890, 1000.0);
        System.out.println("Account 1 created with initial balance:");
        account1.displayAccountInfo();
        System.out.println();

        // Demonstrate creating an account with zero initial balance
        Account account2 = new Account("Doe John", 98000000);
        System.out.println("Account 2 created with zero initial balance:");
        account2.displayAccountInfo();
        System.out.println();

        // Perform transactions on account 1
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println();

        // Perform transactions on account 2
        account2.deposit(1500.0);
        account2.withdraw(1000.0);
    }
}