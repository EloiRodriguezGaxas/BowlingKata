package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingKataTest {

	private Game g;
	
	@Before
	public void setUp() throws Exception {
		g = new Game();
	}
	
	@Test
	public void test() {
		for (int i = 0; i < 20; i++)
			g.roll(0);
		assertEquals(0, g.score());
	}
	
	@Test
	public void testAllOnes() throws Exception {
		for (int i = 0; i < 20; i++)
			g.roll(1);
		assertEquals(20, g.score());
	}

}