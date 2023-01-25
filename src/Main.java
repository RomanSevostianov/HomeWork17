import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.lang.String;


public class Main {


    public static void main(String[] args) {
//


        PassangerCar PasNumberOne = new PassangerCar("volvo", "XC90", 4.5);
        Bus BusNumberOne = new Bus("Mersedes", "s1000", 12);
        Bus BusNumberTwo = new Bus("Volvo", "s2000", 13);



        FreightCar FreightCarOne = new FreightCar("Kamaz", "5002", 8);
        PassangerCar PasNumberTwo = new PassangerCar("Lada", "2108", 1.5);

        BusNumberOne.print();

        System.out.println("        ");

        Mechanic<Bus> IvanPetrov = new Mechanic("Roman", "AvtoGrad", "Ремонт автобусов");
        Mechanic<Bus> IvanPetrov1 = new Mechanic("Roman", "AvtoGrad", "Ремонт автобусов");
        Mechanic<PassangerCar> IvanPetrov3 = new Mechanic("Roman", "AvtoGrad", "Ремонт автобусов");
        FreightCarOne.printSpec(FreightCar.Carrying.N1.name());


        IvanPetrov.addMechanic(BusNumberOne);
        IvanPetrov.addMechanic(BusNumberTwo);
        IvanPetrov.addMechanic(BusNumberTwo);
        IvanPetrov.repair();
        System.out.println("        ");
        //BusNumberOne.diagnosed();
        diagnosed(BusNumberOne, PasNumberOne, FreightCarOne);

//--------------------------------------------------------------------map-
         Map<Mechanic, PassangerCar> map = new HashMap<>();
         map.put(IvanPetrov3, PasNumberTwo);
//----------------------------------------------------------------------

        //  checkMec(IvanPetrov1);

    }



    /*public static void checkMec(Mechanic obj) {
        for (int i = 0; i < 4; i++) {
            System.out.println(obj);
            //boolean mec = IvanPetrov.equals(IvanPetrov1);
        }
    }*/



    public static void diagnosed(Transport... transports) {

        for (Transport transport : transports) {
            try {
                transport.diagnosed();
            } catch (TryExTransport e) {
                System.out.println("Произошла ошибка " + e.getTrans().model);
                System.out.println(e.getMessage());
            }
        }
    }


}
