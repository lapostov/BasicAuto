package ru.netology.BasicAuto.BonusService;

import org.junit.Test;
import org.junit.Assert;




class BonusServiceTest {

    @Test
    public void calculateBonus() {
        BonusService service = new BonusService();
        int expected = 10;
        int amount = 2000;

        int actual = service.calculateBonus(2000);

        Assert.assertEquals(expected, actual);
    }
}