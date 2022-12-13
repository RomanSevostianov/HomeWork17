import java.util.Arrays;

public class Driver<D extends GeneralCar & Competition> {
    public String fio;
    public String driverLicense;
    public int experiens;

    public Driver(String fio, String driverLicense, int experiens) {
        this.fio = fio;
        this.driverLicense = driverLicense;
        this.experiens = experiens;
    }

    public void startDrivers(D car) {
        System.out.println(" Начал движение" + getFio() + GeneralCar.DRIVE_LIS);

    }

    public void stopDrivers(D car) {
        System.out.println("Водитель остановился" + getFio() + Arrays.toString(GeneralCar.DRIVE_LIS));
    }

    public void fuil(D car) {
        System.out.println("Водитель заправил машину" + getFio() + Arrays.toString(GeneralCar.DRIVE_LIS));
    }

    public void fuilCar() {
        System.out.println(getFio() + Arrays.toString(GeneralCar.DRIVE_LIS));
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperiens() {
        return experiens;
    }

    public void setExperiens(int experiens) {
        this.experiens = experiens;
    }
}
