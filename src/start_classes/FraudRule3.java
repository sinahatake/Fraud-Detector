package start_classes;

public class FraudRule3 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if(trader.getCity().equals("Synney")){
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Rule 3";
    }
}
