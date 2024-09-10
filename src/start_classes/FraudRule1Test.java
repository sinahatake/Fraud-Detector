package start_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudRule1Test {
    private FraudRule1 fraudRule1 = new FraudRule1();
    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertTrue(fraudRule1.isFraud(transaction));
    }
     @Test
    public void shouldBeNotFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pole", "Rome", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertFalse(fraudRule1.isFraud(transaction));
    }
}