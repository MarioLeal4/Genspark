package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @Test
//    void randomNumTest() {
//        int i = 0;
//        if (i <= 20 && i >= 1) {
//            assertEquals(Main.randomNum());
//        }
//    }




    @Test
    void gameFeedbackTest() {
        assertEquals("You won!", Main.gameFeedback(3,3),"Test passed!");
        //assertEquals("You won!", Main.gameFeedback(2,3),"failed");
        assertEquals("guessed too high", Main.gameFeedback(1,3),"Test passed!");
        assertEquals("guessed too low", Main.gameFeedback(15,3),"Test passed!");
    }



    @Test
    void ifWonTest() {
        int randomNum =2;
        assertTrue(Main.ifWon(randomNum, 2));
        assertFalse(Main.ifWon(randomNum, 10));
    }
}