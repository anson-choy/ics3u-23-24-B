package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car GWagon = new Car("Mercedes", "GWagon", 2023, 15000.0);
        Car smallCar = new Car("Hyundai", "Kona", 2023, 11000.10);

        GWagon.drive(100.7);
        smallCar.printCarInfo();
    }
}
