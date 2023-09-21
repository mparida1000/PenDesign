import java.util.ArrayList;
import java.util.List;

public class PenFactory {
    public static void main(String[] args) {
        // Create ink for pens
        Ink blueInk = new Ink();
        blueInk.setColor("Blue");

        Ink blackInk = new Ink();
        blackInk.setColor("Black");

        // Create nibs for pens
        Nib mediumNib = new Nib();
        mediumNib.setSize(0.7f);
        mediumNib.setMaterial("Metal");

        Nib fineNib = new Nib();
        fineNib.setSize(0.5f);
        fineNib.setMaterial("Metal");

        // Create refills for ball pens
        Refill ballPenRefill1 = new Refill();
        ballPenRefill1.setPrice(1.0);
        ballPenRefill1.setInk(blueInk);
        ballPenRefill1.setNib(mediumNib);
        ballPenRefill1.setBrand("BallPen Brand 1");

        Refill ballPenRefill2 = new Refill();
        ballPenRefill2.setPrice(1.0);
        ballPenRefill2.setInk(blackInk);
        ballPenRefill2.setNib(fineNib);
        ballPenRefill2.setBrand("BallPen Brand 2");

        // Create refills for gel pens
        Refill gelPenRefill1 = new Refill();
        gelPenRefill1.setPrice(1.2);
        gelPenRefill1.setInk(blueInk);
        gelPenRefill1.setNib(fineNib);
        gelPenRefill1.setBrand("GelPen Brand 1");

        Refill gelPenRefill2 = new Refill();
        gelPenRefill2.setPrice(1.2);
        gelPenRefill2.setInk(blackInk);
        gelPenRefill2.setNib(mediumNib);
        gelPenRefill2.setBrand("GelPen Brand 2");

        // Create pens
        BallPen ballPen1 = new BallPen();
        ballPen1.setBrand("BallPen Brand 1");
        ballPen1.setPrice(5.0);
        ballPen1.setType(PenType.BALL);
        ballPen1.setRefill(ballPenRefill1);

        GelPen gelPen1 = new GelPen();
        gelPen1.setBrand("GelPen Brand 1");
        gelPen1.setPrice(6.0);
        gelPen1.setType(PenType.GEL);
        gelPen1.setRefill(gelPenRefill1);

        FountainPen fountainPen1 = new FountainPen();
        fountainPen1.setBrand("FountainPen Brand 1");
        fountainPen1.setPrice(8.0);
        fountainPen1.setType(PenType.FOUNTAIN);

        // Open and close pens
        List<OpenCloseStrategy> penStrategies = new ArrayList<>();
        penStrategies.add(new ClickStrategy());
        penStrategies.add(new RollingOpenCloseStrategy());

        for (OpenCloseStrategy strategy : penStrategies) {
            ballPen1.setOpenCloseStr(strategy);
            ballPen1.open();
            ballPen1.close();
            ballPen1.write();
            ballPen1.close();
        }

        // Refill pens
        ballPen1.refill();
        gelPen1.refill();
    }
}
