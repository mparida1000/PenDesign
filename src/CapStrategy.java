public class CapStrategy implements OpenCloseStrategy{
    public void open() {
        System.out.println("Remove the cap to open the pen.");
    }

    public void close() {
        System.out.println("Place the cap to close the pen.");
    }
}
