import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HangmanTest {
    Hangman testMan = new Hangman();



    @Test
    public void testNextWordToFind(){


        assertTrue(Arrays.asList(testMan.WORDS).contains("ROCKETS"));

    }


   

}