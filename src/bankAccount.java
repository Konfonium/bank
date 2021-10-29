public class bankAccount {


    private int balance;


    public bankAccount() {

        balance = 0;
    }

    public int getBalance() {

        return balance;
    }

    public void increaseBalance(int i) {

        balance += i;
        //balance = balance + i; är samma som ovan


    }
}
