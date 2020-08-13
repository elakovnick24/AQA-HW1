package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void positiveCase () {
        CashbackHackService cashback = new CashbackHackService();
        assertEquals(999, cashback.remain(1001));
    }

    @Test
    void negativeCase () {
        CashbackHackService noCashBack = new CashbackHackService();
        assertNotEquals(1000, noCashBack.remain(1000));
    }

    @Test
    void subZero () {
        CashbackHackService zero = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, ()-> { zero.remain(0);});
    }
}

