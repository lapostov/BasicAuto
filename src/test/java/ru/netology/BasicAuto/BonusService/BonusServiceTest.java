package ru.netology.BasicAuto.BonusService;

import org.testng.Assert;
import org.testng.annotations.Test;

class BonusServiceTest {


    @Test
    public void calculateBonus() {
        BonusService service = new BonusService();
        int expected = 10;
        int amount = 2000;

        int actual = service.calculateBonus(amount);

        Assert.assertEquals(actual, expected);

    }
    
    @Test
    public void by1000() {
        BonusService service = new BonusService();
        int expected = 1;
        int amount = 1000;

        int actual = service.calculateBonus(amount);

        Assert.assertEquals(actual, expected);
    }
}