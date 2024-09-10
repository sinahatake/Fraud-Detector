package start_classes;

public interface FraudRule {
    boolean isFraud(Transaction transaction);
    String getRuleName();
}

