public class Main {
    public static void main(String[] args) {

        PassangerCar PasNumberOne = new PassangerCar("volvo", "XC90", 4.5, 4);
        Bus BusNumberOne = new Bus("Mersedes", "s1000", 12, 120);
        FreightCar FreightCarOne = new FreightCar("Kamaz", "5002", 8, 20.5);
        PassangerCar PasNumberTwo = new PassangerCar("Lada", "2108", 1.5, 2);
        PasNumberTwo.getPitStop();
    }

    Driver<PassangerCar> DriverOne = new Driver<>("Rostov D.F", GeneralCar.CMD_B, 70);
    Driver Two = new Driver("Tolstov", GeneralCar.CMD_B, 10);
}