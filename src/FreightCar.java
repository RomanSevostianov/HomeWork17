import java.util.Arrays;

public class FreightCar extends Transport implements Competition {

    public enum Carrying {
        N1(" до 3.5"),
        N2("3.5-12"),
        N3("свыше 12");

        private static Carrying fingType(String inform) {
            for (Carrying carrying : values()) {
                if (carrying.getInform().equals(inform)) {
                    return carrying;
                }
            }
            return null;
        }

        private String inform;

        Carrying(String inform) {
            this.inform = inform;
        }

        public String getInform() {
            return inform;
        }
    }

    private String[] carryingNull = new String[0];


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
    public String[] getAllType() {
        String[] carry = new String[FreightCar.Carrying.values().length];

        for (int i = 0; i < carry.length; i++) {
            carry[i] = FreightCar.Carrying.values()[i].name();
        }
        return carry;
    }

    public void testType(String typeTes) {
        PassangerCar.BodyType bodyType = PassangerCar.BodyType.valueOf(typeTes);
        carryingNull = Arrays.copyOf(carryingNull, carryingNull.length + 1);
        carryingNull[carryingNull.length - 1] = typeTes;
    }

    public void printSpec(String print) {
        Carrying carrying = Carrying.valueOf(print);
        if (carrying == null) {
            carrying = Carrying.fingType(print);
        }

        switch (carrying) {

            case N1:
                System.out.println("С полной массой до 3.5 тонн");
                break;
            case N2:
                System.out.println("С полной массой свыше 3,5 до 12 тонн");
            case N3:
                System.out.println("С полной массой свыше 12 тонн");
                break;
            default:
        }


    }

}
