public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        director.print();

        Worker worker = new Worker();
        worker.print();

        Accountant accountant = new Accountant();
        accountant.print();
    }
}