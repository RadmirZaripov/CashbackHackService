package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void CashbackTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = service.remain(amount);
        int actual = 500;
        assertEquals(actual, expected);

    }

    @Test
    public void CashBackTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1400;
        int expected = service.remain(amount);
        int actual = 600;
        assertEquals(actual, expected);
    }
    @Test
    public void CashbackTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = service.remain(amount);
        int actual = 500;
        assertEquals(actual, expected);

    }
}