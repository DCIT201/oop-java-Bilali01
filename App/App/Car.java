public class Car extends Vehicle {
    private static final double DAILY_RENTAL_RATE = 50.0;

    public Car(String licensePlate, boolean availableForRental) {
        super(licensePlate, availableForRental);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * DAILY_RENTAL_RATE;
    }
}