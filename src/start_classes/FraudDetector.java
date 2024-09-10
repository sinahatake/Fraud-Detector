package start_classes;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    FraudDetectionResult isFraud(Transaction transaction){
        ArrayList<FraudRule> fraudRuleList = new ArrayList<FraudRule>();
        fraudRuleList.add(new FraudRule1());
        fraudRuleList.add(new FraudRule2());
        fraudRuleList.add(new FraudRule3());
        fraudRuleList.add(new FraudRule4());
        fraudRuleList.add(new FraudRule5());

        return fraudRuleList.stream()
        .filter(fraudRule -> fraudRule.isFraud(transaction))  // ищем первое правило, которое считает транзакцию мошеннической
        .findFirst()                                         // находим первое подходящее правило (если есть)
        .map(this::buildFraudResult)                         // если нашли такое правило, создаем результат мошенничества
        .orElse(buildNotFraudResult());                      // если ни одно правило не сработало, возвращаем результат "не мошенничество"

    }
    private FraudDetectionResult buildFraudResult(FraudRule fraudRule){
            return new FraudDetectionResult(true, fraudRule.getRuleName());
        }

        private FraudDetectionResult buildNotFraudResult(){
            return new FraudDetectionResult(false, null);
        }

}
