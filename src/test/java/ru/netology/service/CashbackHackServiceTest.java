package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashback = new CashbackHackService();

    @Test

    public void oneThousand() {
        int expected = 0;
        int actual = cashback.remain(1000);
        assertEquals(actual, expected);
    }


    @Test
    public void Half() {
        int expected = 500;
        int actual = cashback.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void trista() {
        int expected = 300;
        int actual = cashback.remain(700);
        assertEquals(actual, expected);
    }

    @Test
    public void border999() {
        int expected = 999;
        int actual = cashback.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void minimumOne() {
        int expected = 1 ;
        int actual = cashback.remain(999);
        assertEquals(actual, expected);
    }
}