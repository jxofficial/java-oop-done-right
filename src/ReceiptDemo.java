public class ReceiptDemo {

    public static void main(String[] args) {
       new ReceiptDemo().run();
    }

    private void run() {
        Receipt r = new Receipt(new Printer());

        r.add("Brie", new Money("1.95", "SGD"));
        r.add("Bread", new Money("0.95", "SGD"));
        r.add("Merlot", new Money("12.95", "SGD"));

        r.print();
    }
}
