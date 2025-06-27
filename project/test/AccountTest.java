import main.java.com.semicolon.africa.model.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void deposit(){
        // Precondition
        Account giftAccount = new Account(0);
        assertEquals(0, giftAccount.getBalance());

        // Action
        giftAccount.deposit(2_000);
        assertEquals(2_000, giftAccount.getBalance());
    }
    @Test
    public void withdraw(){
        // Precaution
      Account giftAccount = new Account(2_000);
      assertEquals(2_000, giftAccount.getBalance());


      //Action
        giftAccount.withdraw(2_000);
        assertEquals(0, giftAccount.getBalance());
    }
    @Test
    public void withdrawAmountLargerThanBalance() {
        // Precaution
        Account giftAccount = new Account(5_000);
        assertEquals(5_000, giftAccount.getBalance());

        // Action
        giftAccount.withdraw(6_000);
        assertEquals(5_000, giftAccount.getBalance());
    }
    @Test
    public void negativeDeposit_checkThatBalanceIsUnchanged(){
        // Precaution
        Account giftAccount = new Account(1_500);
        assertEquals(1500, giftAccount.getBalance());

        // Action
        giftAccount.deposit(-2_000);
        assertEquals(1500, giftAccount.getBalance());
    }
}
