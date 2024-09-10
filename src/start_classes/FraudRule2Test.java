package start_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule2Test {

    private FraudRule2 fraudRule2 = new FraudRule2();
    @Test
    public void shouldBeFraudTransactionWithAmountMore1000000(){
        Trader trader = new Trader("Pasha", "Rome", "Russia");
        Transaction transaction = new Transaction(trader, 1000001);
        Assert.assertTrue(fraudRule2.isFraud(transaction));
    }
    @Test
    public void shouldBeNotFraudTransactionWithAmountMore1000000(){
        Trader trader = new Trader("Pasha", "Rome" ,"Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertFalse(fraudRule2.isFraud(transaction));
    }
}