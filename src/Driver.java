

public class Driver<D extends Transport> {
    private String fio;

    private int experiens;
    public D transp;

    public Driver(String fio,  int experiens, D transp) {
        this.fio = fio;

        this.experiens = experiens;
        this.transp = transp;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }



    public int getExperiens() {
        return experiens;
    }

    public void setExperiens(int experiens) {
        this.experiens = experiens;
    }

    public D getTransp() {
        return transp;
    }

    public void setTransp(D transp) {
        this.transp = transp;
    }

    public void startDrive (){
        System.out.println(" Начал движение");
        this.transp.startDrive();
    }

    public void stopDrive (){
        System.out.println("Завершил движение");
        this.transp.stopDrive();
    }

    public void reFill(){
        System.out.println("Водитель заправился");
    }

    public void printDr (){
        System.out.println("Водитель "+getFio());

    }

}

