package ru.netology.BasicAuto.BonusService;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void Amount900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;


        int actual = service.remain(900);
     assertEquals(expected, actual);

    }

    @Test
    public void FullPurchase() { CashbackHackService service = new CashbackHackService();
        int expected = 1000;


        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }

    @Test
    public void overFullPurchase() { CashbackHackService service = new CashbackHackService();
        int expected = 1000;


        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }

    @Test
    public void ZeroPurchase() { CashbackHackService service = new CashbackHackService();
        int expected = 1000;


        int actual = service.remain(0);
        assertEquals(expected, actual);

    }

}
