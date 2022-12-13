public class PassangerCar extends GeneralCar implements Competition {


    public int numberOfDoors;
    public String typeLicenseBus="B";

    public PassangerCar(String brent, String model, double engineVolume, int numberOfDoors) {
        super(brent, model, engineVolume);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public void getPitStop() {
        System.out.println("Пришла на финишь первая");
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
}