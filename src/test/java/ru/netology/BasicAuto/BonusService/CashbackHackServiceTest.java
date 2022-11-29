package ru.netology.BasicAuto.BonusService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {


    @Test
    public void CashbackHackService() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;

        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackService950() {

        CashbackHackService service = new CashbackHackService();
        int expected = 50;

        int actual = service.remain(950);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void FullAmount() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;

        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ZeroAmount() {

        CashbackHackService service = new CashbackHackService();
        int expected = 1000;

        int actual = service.remain(0);
        Assert.assertEquals(actual, expected);
    }
}

