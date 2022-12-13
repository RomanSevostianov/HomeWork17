public class GeneralCar implements Competition {

    public String brent;
    public String model;
    public double engineVolume;

    public static final String CMD_B = "B";
    public static final String CMD_C = "C";
    public static final String CMD_D = "Д";

    public static final String [] DRIVE_LIS= {CMD_B,CMD_C,CMD_D};
    public GeneralCar(String brent, String model, double engineVolume) {
        this.brent = brent;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void startTraffic (){

    }
    public void finishTheMove (){

    }

    public String getBrent() {
        return brent;
    }

    public void setBrent(String brent) {
        this.brent = brent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
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
