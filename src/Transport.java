public abstract class Transport {

    public String brent;
    public String model;
    public double engineVolume;

    public Transport(String brent, String model, double engineVolume) {
        this.brent = brent;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void diagnosed () throws TryExTransport {

    }

    public void startDrive() {
    }

    public void stopDrive() {
    }

    public String getBrent() {
        return brent;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brent='" + brent + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
