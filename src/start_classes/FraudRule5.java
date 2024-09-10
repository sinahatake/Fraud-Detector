package start_classes;

public class FraudRule5 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Rule 5";
    }

}
