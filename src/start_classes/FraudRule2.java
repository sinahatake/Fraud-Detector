package start_classes;

class FraudRule2 implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if(transaction.getAmount() > 1000000){
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Rule 2";
    }
}
