public class Director implements PrintPosition {

    String name = "director";

    @Override
    public void print() {
        System.out.println("Your position is " + name);
    }
}
