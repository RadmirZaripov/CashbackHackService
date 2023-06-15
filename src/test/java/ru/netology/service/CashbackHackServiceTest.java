package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {


        @Test
        public void CashbackTest() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;
            int expected = 1;
            int actual = service.remain(amount);
            assertEquals(expected, actual);

        }

        @Test
        public void CashBackTest2() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(expected, actual);
        }

        @Test
        public void CashbackTest3() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int expected = 999;
            int actual = service.remain(amount);
            assertEquals(expected, actual);

        }
}