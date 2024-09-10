package start_classes;

public class FraudRule4 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if(trader.getCountry().equals("Jamaica")){
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Rule 4";
    }

}
