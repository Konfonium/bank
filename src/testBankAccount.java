import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testBankAccount {


    @Test
    public void test() {

        //Arrange
        bankAccount bank = new bankAccount();


        //Act
        bank.increaseBalance(20000);

        int actual = bank.getBalance();


        //Assert
        int expected = 20000;

        assertEquals(expected, actual);

    }


}
