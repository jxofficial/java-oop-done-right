public class Item {
    private final String description;
    private final Money price;

    public Item(String desc, Money price) {
        this.description = desc;
        this.price = price;
    }

    public void print(Printer p) {
        new ItemFormat(description, price).print(p);
    }
}
