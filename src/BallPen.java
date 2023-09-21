public class BallPen extends Pen implements IRefillable{
    private Refill refil;

    public OpenCloseStrategy getOpenCloseStr() {
        return openCloseStr;
    }

    public void setOpenCloseStr(OpenCloseStrategy openCloseStr) {
        this.openCloseStr = openCloseStr;
    }

    private OpenCloseStrategy openCloseStr;
    public void refill(){
        System.out.println("Refil the Ball pen");
    }
    public void write(){
        System.out.println("Write using Ball pen");
    }
    public void open(){

        openCloseStr.open();
    }
    public void close(){
        openCloseStr.close();
    }

    public Refill getRefil() {
        return refil;
    }

    public void setRefill(Refill refil) {
        this.refil = refil;
    }
}
