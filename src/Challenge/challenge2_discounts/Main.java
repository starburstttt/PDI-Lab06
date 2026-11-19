package challenge2_discounts;

public class Main {
    public static void main(String[] args) {
        SeasonalDiscount sd = new SeasonalDiscount();
        System.out.println("With super() (5% then 10%): $" + sd.apply(100.0));
        System.out.println("Without super() (10% only): $" + sd.applyWithoutSuper(100.0));
    }
}
