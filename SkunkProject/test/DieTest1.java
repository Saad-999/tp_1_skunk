import static org.junit.Assert.*;

import org.junit.Test;

public class DieTest1 {

	@Test
	public void test() {
		//predictable
		Die d = new Die(new int[] {1,2,1,5,4,1,2,3});
		
		assertEquals(d.getLastRoll(), 1);
		d.roll();
		assertEquals(d.getLastRoll(), 2);
		d.roll();
		assertEquals(d.getLastRoll(), 1);
		d.roll();
		assertEquals(d.getLastRoll(), 5);
		d.roll();
		assertEquals(d.getLastRoll(), 4);
		d.roll();
		assertEquals(d.getLastRoll(), 1);
		d.roll();
		assertEquals(d.getLastRoll(), 2);
		d.roll();
		assertEquals(d.getLastRoll(), 3);
		d.roll();
		
		//random die
		int roll = d.getLastRoll();
		boolean range = (roll > 0 && roll < 7);
		assertTrue(range );
	}

}
