public class FreightCar extends GeneralCar implements Competition{
    public double loadCapacity;
    public String typeLicenseBus="D";

    public FreightCar(String brent, String model, double engineVolume, double loadCapacity) {
        super(brent, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
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
}
