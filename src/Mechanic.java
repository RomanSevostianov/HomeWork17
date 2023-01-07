import java.util.LinkedList;
import java.util.Queue;

public class Mechanic<T extends Transport> {

    private String name;
    private String company;
    private String type;


    public Mechanic(String name, String company, String type) {
        this.name = name;
        this.company = company;
        this.type = type;
    }

    private Queue<T> queue = new LinkedList<>(); // для того чтобы работать с очередью необходимо 3 метода.


    public void addMechanic(T transpotr) { // метод который добавляет транспорт к механику на ремонт
        queue.offer(transpotr); // добавляем в конец очереди транспортное средство
    }

    public void repair() {
        T transport = queue.poll(); //транспорт после ремонта удаляется из очереди
        if (transport != null) {
            System.out.println("Механик " + name + " производит ремонт транспорта " + transport);
            repair();
        } else {
            System.out.println("Ремонт всего транспорта закончен ");
        }
    }

    public int queueSize() { // метод считает размер очереди на ремонт
        return queue.size();
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", queue=" + queue +
                '}';
    }
}