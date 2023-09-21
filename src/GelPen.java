public class GelPen extends Pen implements IRefillable {
    private Refill refil;

    public Refill getRefil() {
        return refil;
    }

    public void setRefill(Refill refil) {
        this.refil = refil;
    }

    @Override
    public void refill(){
        System.out.println("Refil the Gel pen");
    }
    public void write(){
        System.out.println("Write using gel pen");
    }
    public void open(){
        System.out.println("Open gel pen");
    }
    public void close(){
        System.out.println("Close gel pen");
    }
}
