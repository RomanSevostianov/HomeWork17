public class Bus extends GeneralCar implements Competition {
    public int numberOfSeats;
    public String typeLicenseBus = "C";

    public Bus(String brent, String model, double engineVolume, int numberOfSeats) {
        super(brent, model, engineVolume);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {

    }

    @Override
    public String[] driverLis() {
        return new String[0];
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", typeLicenseBus='" + typeLicenseBus + '\'' +
                ", brent='" + brent + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
