public class FreightCar extends Transport implements Competition{

    public FreightCar(String brent, String model, double engineVolume) {
        super(brent, model, engineVolume);
    }

    public void startDrive() {
        System.out.println("Автобус начал движение");
    }

    public void stopDrive() {
        System.out.println("Автобус закончил движение");
    }
    @Override
    public void getPitStop() {

    }

    @Override
    public int getBestLapTime() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "brent='" + brent + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
