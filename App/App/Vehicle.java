public abstract class Vehicle {
    private String licensePlate;
    private boolean availableForRental;

    public Vehicle(String licensePlate, boolean availableForRental) {
        this.licensePlate = licensePlate;
        this.availableForRental = availableForRental;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isAvailableForRental() {
        return availableForRental;
    }

    public void setAvailableForRental(boolean availableForRental) {
        this.availableForRental = availableForRental;
    }

    public abstract double calculateRentalCost(int days);
}