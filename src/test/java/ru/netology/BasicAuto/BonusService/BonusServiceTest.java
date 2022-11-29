package ru.netology.BasicAuto.BonusService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService service = new BonusService();
        int expected = 10;
        int amount = 2000;

        int actual = service.calculateBonus(amount);

        assertEquals(expected, actual);
    }
}