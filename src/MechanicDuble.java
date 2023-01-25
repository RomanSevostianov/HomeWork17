import java.util.HashSet;
import java.util.Set;

public class MechanicDuble {//используется для проверки того, существует ли указанный элемент в данном списке или нет.

    private Set<Mechanic> meh = new HashSet<>();


    public void addMechanic(Mechanic mechanic) {
        if (meh.contains(mechanic)) {
            throw new IllegalArgumentException("Механик есть в списке");
        } else {
            meh.add(mechanic);
        }
        meh.add(mechanic);
    }
}
