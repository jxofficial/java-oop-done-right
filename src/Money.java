import java.math.BigDecimal;

public class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money add(Money m1, Money m2) {
        if (!m1.currency.equals(m2.currency)) throw new ArithmeticException("Currencies are different");
        return new Money(m1.amount.add(m2.amount), m1.currency);
    }

    public void print(Printer p) {
        p.print(currency);
        p.print(amount.toString());
    }
}
