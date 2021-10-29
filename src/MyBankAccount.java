import java.util.Scanner;

public class MyBankAccount {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        bankAccount bank = new bankAccount();

        System.out.println("Add money: ");

        while (true) {

            int addAmount = Integer.parseInt(scan.nextLine());

            bank.increaseBalance(addAmount);

            System.out.println("The Balance is: " + bank.getBalance());
        }

    }
}
