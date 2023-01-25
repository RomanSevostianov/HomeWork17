import java.lang.reflect.Array;
import java.util.Arrays;

public class PassangerCar extends Transport implements Competition {


    public enum BodyType {SEDAN, HATCHBACK, COUPE, UNIVERSAL, JEEP, CROSSOVER, PICKUP, VAN, MINIVAN}

    private String[] bodyTypeCarNull = new String[0];

    public PassangerCar(String brent, String model, double engineVolume) {
        super(brent, model, engineVolume);
    }



    public void startDrive() {
        System.out.println("Авто начал движение");
    }

    public void stopDrive() {
        System.out.println("Авто закончил движение");
    }

    @Override
    public void diagnosed() throws TryExTransport {
        super.diagnosed();
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
    public String[] getAllType() {
        String[] type = new String[BodyType.values().length];

        for (int i = 0; i < type.length; i++) {
            type[i] = BodyType.values()[i].name();
        }
        return type;
    }

    public void testType(String typeTes) {
        BodyType bodyType = BodyType.valueOf(typeTes);
        bodyTypeCarNull = Arrays.copyOf(bodyTypeCarNull, bodyTypeCarNull.length + 1);
        bodyTypeCarNull[bodyTypeCarNull.length - 1]=typeTes;
    }

}

