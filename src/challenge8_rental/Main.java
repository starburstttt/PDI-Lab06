package challenge8_rental;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RentalItem> rentals = new ArrayList<>();
        rentals.add(new CarRental("Sedan"));
        rentals.add(new BikeRental("Mountain Bike"));
        rentals.add(new ToolRental("Power Drill"));
        rentals.add(new CameraRental("DSLR Camera"));

        int days = 3;
        for (RentalItem item : rentals) {
            System.out.println(item.getItemName() + " for " + days + " days: $" + item.calculateCost(days));
        }
    }
}
