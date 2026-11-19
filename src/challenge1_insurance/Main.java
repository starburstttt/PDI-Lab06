package challenge1_insurance;

public class Main {
    public static void main(String[] args) {
        InsurancePolicy p1 = new HealthInsurance();
        InsurancePolicy p2 = new CarInsurance();
        System.out.println("Overridden Health: $" + p1.calculatePremium());
        System.out.println("Overridden Car: $" + p2.calculatePremium());

        CarInsurance car = new CarInsurance();
        System.out.println("Overloaded Car (Age 22): $" + car.calculatePremium(22));
        System.out.println("Overloaded Car (Age 22, 2 accidents): $" + car.calculatePremium(22, 2));
    }
}
