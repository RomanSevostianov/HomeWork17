import java.util.HashSet;
import java.util.Set;

public class Driver<D extends Transport> {


    Set<String> driverSet = new HashSet<>();
    private int experiens; // стаж вождения
    public D transp;

    public Driver(Set<String> driverSet, int experiens, D transp) {
        this.driverSet = driverSet;
        this.experiens = experiens;
        this.transp = transp;
    }
}

