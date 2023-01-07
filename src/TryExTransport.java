public class TryExTransport extends Exception {

    public Transport trans;

    public TryExTransport(String message, Transport trans) {
        super(message);
        this.trans=trans;
    }

    public Transport getTrans() {
        return trans;
    }
}
