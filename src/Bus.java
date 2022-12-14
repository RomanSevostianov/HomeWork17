public class Bus extends Transport implements Competition {

    public Bus(String brent, String model, double engineVolume) {
        super(brent, model, engineVolume);
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

    /*@Override
    public String toString() {
        return "Bus{" +
                "brent='" + brent + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }*/

    public void print (){
        System.out.println("Название транспорта "+getBrent()+ " "+ "Водитель" );
    }
}





