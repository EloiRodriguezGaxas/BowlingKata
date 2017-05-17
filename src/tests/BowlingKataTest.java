package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingKataTest {

	@Test
	public void test() {
		Game g = new Game();
	    for (int i=0; i<20; i++)
	        g.roll(0);
	    assertEquals(0, g.score());
	}
	
	  public void testAllOnes() throws Exception {
		  Game g = new Game();
		  for (int i = 0; i < 20; i++)
			  g.roll(1);
		  assertEquals(20, g.score());
	  }

}