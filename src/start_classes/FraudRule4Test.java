package start_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule4Test {
    private FraudRule4 fraudRule4 = new FraudRule4();
    @Test
    public void shouldBeFraudTransactionFromJamaica(){
        Trader trader = new Trader("Pasha", "Synney","Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertTrue(fraudRule4.isFraud(transaction));
    }
    @Test
    public void shouldBeNotFraudTransactionFromJamaica(){
        Trader trader = new Trader("Pasha", "Rome","Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertFalse(fraudRule4.isFraud(transaction));
    }

}