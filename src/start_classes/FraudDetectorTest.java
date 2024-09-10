package start_classes;

import org.junit.*;

public class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertTrue(fraudDetector.isFraud(transaction));
    }
     @Test
    public void shouldBeNotFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        Assert.assertFalse(fraudDetector.isFraud(transaction));
    }

}
