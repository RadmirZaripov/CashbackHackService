package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    public void CashbackTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = service.remain(amount);
        int actual = 1;
        assertEquals(actual, expected);

    }

    @Test
    public void CashBackTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void CashbackTest3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = service.remain(amount);
        int actual = 999;
        assertEquals(actual, expected);

    }
}