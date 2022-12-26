import java.math.BigDecimal;

public class Bus extends Transport implements Competition {

    public enum CapacityTypeBus {

        ESPECILLY_SMALL_BUS("до 10 мест"),
        SMALL("до 25 мест"),
        AVERAGE("с 40 до 50"),
        BIG_BUS("60-80"),
        ESPECILLY_BIG_BUS("с 100 до 120 мест");

        private String informBus;
        public String getInformBus() {
            return informBus;
        }

        private  CapacityTypeBus CapType(String informBus) {  //конструктор enum
            for (CapacityTypeBus c: values() ){
                if (c.getInformBus().equals(informBus)) {
                    return c;
                }
            }
            return null;
        }

        CapacityTypeBus(String informBus) {
            this.informBus = informBus;
        }
    }
    private String[] capactyBusNull = new String[0];

    public Bus(String brent, String model, double engineVolume) {
        super(brent, model, engineVolume);
    }

    @Override
    public void diagnosed() throws TryExTransport {
        throw new TryExTransport("Автобус не может проходить диагностику", this);
    }

    @Override
    public void startDrive() {
        System.out.println("Автобус начал движение");
    }

    @Override
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
        String[] carry = new String[Bus.CapacityTypeBus.values().length];

        for (int i = 0; i < carry.length; i++) {
            carry[i] = Bus.CapacityTypeBus.values()[i].name();
        }
        return carry;
    }


    public void print() {
        System.out.println("Название транспорта " + getBrent() + " " + "Водитель");
    }
}





