package start_classes;

public class FraudRule1 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Rule 1";
    }
}
