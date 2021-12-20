import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void decisionTest() {
        String answer = "You approach the cave..." + '\n' + "It is dark and spooky..." + '\n' +
                "A large dragon jumps out in front of you! He opens his jaws and..." + '\n' + "Gobbles you down in one bite!";

 assertEquals(answer, Main.decision(1), "Test passed" );
    }
}