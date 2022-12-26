public class Main {
    public static void main(String[] args) {

        PassangerCar PasNumberOne = new PassangerCar("volvo", "XC90", 4.5);
        Bus BusNumberOne = new Bus("Mersedes", "s1000", 12);
        FreightCar FreightCarOne = new FreightCar("Kamaz", "5002", 8);
        PassangerCar PasNumberTwo = new PassangerCar("Lada", "2108", 1.5);

        BusNumberOne.print();
        CategoryC one = new CategoryC("Сергей", 30, BusNumberOne);



        FreightCarOne.printSpec(FreightCar.Carrying.N1.name());


       //BusNumberOne.diagnosed();

      
      diagnosed (BusNumberOne,PasNumberOne, FreightCarOne);

    }

    public static void diagnosed (Transport... transports){


        for (Transport transport : transports) {
            try {
            transport.diagnosed();
            }
            catch (TryExTransport e){
                System.out.println("Произошла ошибка "+e.getTrans().model);
                System.out.println(e.getMessage());
            }


        }
    }

}