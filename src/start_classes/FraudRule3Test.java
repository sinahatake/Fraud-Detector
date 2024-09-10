package start_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule3Test {
    private FraudRule3 fraudRule3 = new FraudRule3();
    @Test
    public void shouldBeFraudTransactionFromSynney(){
        Trader trader = new Trader("Pasha", "Synney","Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertTrue(fraudRule3.isFraud(transaction));
    }
    @Test
    public void shouldBeNotFraudTransactionFromSynney(){
        Trader trader = new Trader("Pasha", "Rome","Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertFalse(fraudRule3.isFraud(transaction));
    }
}