public class RewardValue {

    private final double cashValue;
    private final double milesValue; // Predefined conversion for simplicity

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Assuming a fixed conversion rate of 1 mile per dollar for simplicity
        // You can replace this with logic to fetch conversion rates from an external
        // source
        this.milesValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // You can add similar methods for other reward programs (e.g.,
    // getHotelPointsValue())
    // if you implement logic to retrieve conversion rates for those programs.
}
