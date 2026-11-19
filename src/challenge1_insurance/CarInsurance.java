package challenge1_insurance;

public class CarInsurance extends InsurancePolicy {
    @Override
    public double calculatePremium() {
        return 200.0;
    }

    public double calculatePremium(int ageOfDriver) {
        return 200.0 + (ageOfDriver < 25 ? 100.0 : 0.0);
    }

    public double calculatePremium(int ageOfDriver, int accidentHistory) {
        return calculatePremium(ageOfDriver) + (accidentHistory * 50.0);
    }
}
