import main.java.com.semicolon.africa.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account giftAccount;
    @BeforeEach
    public void doThisFirst() {
        Account giftAccount = new Account(0, "Gifted");
    }
    @Test
    public void deposit(){
       // Account giftAccount = new Account(0, "Gifted");
        assertEquals(0, giftAccount.getBalance());

        giftAccount.deposit(2_000);
        assertEquals(2_000, giftAccount.getBalance());
    }
    @Test
    public void withdraw(){
        //Account giftAccount = new Account(2_000, "Gifted");
      assertEquals(2_000, giftAccount.getBalance());

        giftAccount.withdraw(2_000, "Gifted");
        assertEquals(2_000, giftAccount.getBalance());
    }
    @Test
    public void withdrawAmountLargerThanBalance() {
        //Account giftAccount = new Account(5_000, "Gifted");
        assertEquals(5_000, giftAccount.getBalance());

        giftAccount.withdraw(6_000, "Gifted");
        assertEquals(5_000, giftAccount.getBalance());
    }
    @Test
    public void negativeDeposit_checkThatBalanceIsUnchanged(){
        //Account giftAccount = new Account(1500, "Gifted");
        assertEquals(1500, giftAccount.getBalance());

        giftAccount.deposit(-2_000);
        assertEquals(1500, giftAccount.getBalance());
    }
    @Test
    public void withdrawWithWrong_balanceRemainTheSame(){
        //Account giftAccount = new Account(1500, "Gifted");
        assertEquals(1500, giftAccount.getBalance());

        giftAccount.withdraw(1500, "ufyytfuy");
        assertEquals(1500, giftAccount.getBalance());



    }
}