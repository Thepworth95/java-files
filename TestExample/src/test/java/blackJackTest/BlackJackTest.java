package blackJackTest;

import static org.junit.Assert.*;

import org.junit.Test;

import blackJack.BlackJack;

public class BlackJackTest {

	private BlackJack jack = new BlackJack();

	@Test
	public void testHighestWins() {

		assertEquals("Highest number did not win", 21, jack.play(16, 21));

	}

	@Test
	public void testAOver21Looses() {

		assertEquals("Over 21 did not loose", 17, jack.play(17, 23));

	}

	@Test
	public void testBOver21Looses() {

		assertEquals("Over 21 did not loose", 17, jack.play(23, 17));

	}

	@Test
	public void testBothOver21() {

		assertEquals("Winner When both bust", 0, jack.play(27, 23));

	}

}
