public class RollingOpenCloseStrategy implements  OpenCloseStrategy{
    public void open() {
        System.out.println("Roll to open the pen.");
    }

    public void close() {
        System.out.println("Roll to close the pen.");
    }
}
