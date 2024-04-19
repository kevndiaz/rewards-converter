public class RewardValue {

    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * ConversionRate.CASH_TO_MILES;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    private static class ConversionRate {
        public static final double CASH_TO_MILES = 1.0; // You can adjust this conversion rate
        public static final double MILES_TO_CASH = 0.0035; // Conversion rate for miles to cash
    }
}
