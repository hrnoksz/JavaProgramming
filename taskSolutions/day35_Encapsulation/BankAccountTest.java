package day35_Encapsulation;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount acOne = new BankAccount("harun", 123456789, 10000);

        acOne.deposit(1000);
        acOne.withdraw(5000);
        System.out.println(acOne.getBalance());

        acOne.withdraw(7000);
        System.out.println(acOne.getBalance());
    }
}
