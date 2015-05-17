package scramble;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScrambleTest {

	@Test
	public void testScramble() {
		assertEquals(Scramble.scramble("Scramble the words in this sentence"), "Slbmarce the wdros in tihs scnetnee");
	}

}
