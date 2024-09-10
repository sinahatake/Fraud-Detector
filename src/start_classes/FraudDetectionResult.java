package start_classes;

public class FraudDetectionResult {
    private boolean isFraud;
    private String FraudRule;

    public FraudDetectionResult(boolean isFraud, String fraudRule) {
        this.isFraud = isFraud;
        FraudRule = fraudRule;
    }
}
