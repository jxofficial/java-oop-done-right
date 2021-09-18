import java.math.BigDecimal;

public class ReceiptDemo {

    public static void main(String[] args) {
       new ReceiptDemo().run();
    }

    private void run() {
        Receipt r = new Receipt(new Printer());

        r.add("Brie", new Money(new BigDecimal("1.95"), "SGD"));
        r.add("Bread", new Money(new BigDecimal("0.95"), "SGD"));
        r.add("Merlot", new Money(new BigDecimal("12.95"), "SGD"));

        r.print();
    }
}
