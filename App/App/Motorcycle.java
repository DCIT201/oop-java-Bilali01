public class Motorcycle extends Vehicle {
    private static final double DAILY_RENTAL_RATE = 30.0;

    public Motorcycle(String licensePlate, boolean availableForRental) {
        super(licensePlate, availableForRental);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * DAILY_RENTAL_RATE;
    }
}