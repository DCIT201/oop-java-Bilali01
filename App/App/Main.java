public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Benz", true);
        Vehicle motorcycle = new Motorcycle("Buzanga", true);
        Vehicle truck = new Truck("Tata", true);

        System.out.println("Car rental cost for 5 days: $" + car.calculateRentalCost(5));
        System.out.println("Motorcycle rental cost for 3 days: $" + motorcycle.calculateRentalCost(3));
        System.out.println("Truck rental cost for 7 days: $" + truck.calculateRentalCost(7));
    }
}