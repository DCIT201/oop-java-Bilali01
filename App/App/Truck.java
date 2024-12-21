public class Truck extends Vehicle {
    private static final double DAILY_RENTAL_RATE = 80.0;

    public Truck(String licensePlate, boolean availableForRental) {
        super(licensePlate, availableForRental);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * DAILY_RENTAL_RATE;
    }
}