import entities.Account;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Alex",1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1001,"Julia",1000.0,2.0);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());
    }
}