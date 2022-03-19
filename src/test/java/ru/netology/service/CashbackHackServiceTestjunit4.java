package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTestjunit4 {

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
    public void randomTestNumber() {
        int expected = 300;
        int actual = cashback.remain(700);
        assertEquals(actual, expected);
    }

    @Test
    public void border1001() {
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