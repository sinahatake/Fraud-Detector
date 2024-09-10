package start_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule5Test {
    private FraudRule5 fraudRule5= new FraudRule5();
    @Test
    public void shouldBeFraudTransactionFromGeremanyAndMore1000(){
        Trader trader = new Trader("Pasha", "Berlin","Germany");
        Transaction transaction = new Transaction(trader, 10000);
        Assert.assertTrue(fraudRule5.isFraud(transaction));
    }
    @Test
    public void shouldBeNotFraudTransactionFromGeremanyAndMore1000(){
        Trader trader = new Trader("Pasha", "Berlin","Germany");
        Transaction transaction = new Transaction(trader, 100);
        Assert.assertFalse(fraudRule5.isFraud(transaction));
    }
}