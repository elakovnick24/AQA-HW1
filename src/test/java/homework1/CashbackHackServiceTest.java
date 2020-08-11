package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cb = new CashbackHackService();
        assertEquals(999, cb.remain(1001));
    }

    @Test
    void test2() {
        CashbackHackService cb2 = new CashbackHackService();
        assertNotEquals(1000, cb2.remain(1000));
    }
}