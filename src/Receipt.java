import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// Aggregate class
public class Receipt {
    private final Printer printer;
    private final List<Item> items = new ArrayList<>();
    private Money total = new Money(new BigDecimal(0), "SGD");

    public Receipt(Printer p) {
        this.printer = p;
    }

    public void add(String desc, Money price) {
        items.add(new Item(desc, price));
        total = Money.add(total, price);
    }

    public void print() {
       items.forEach(item -> item.print(printer));
       printer.print("The total is: ");
       total.print(printer);
    }
}
