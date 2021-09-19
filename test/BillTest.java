import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    @Test
    public void totalStartsAtZero() {
        var bill = new Bill();
        float total = bill.getTotal();
        assertEquals(0, total);
    }

    @Test
    public void correctTotalForOneItem() {
        var bill = new Bill();
        bill.add(12.95);
        float total = bill.getTotal();
        assertEquals(12.95, total, 0.1f);
    }
    @Test
    public void correctTotalForTwoItems() {
        var bill = new Bill();
        bill.add(12.95);
        bill.add(2.05);
        float total = bill.getTotal();
        assertEquals(12.95+2.05, total, 0.1f);
    }
}