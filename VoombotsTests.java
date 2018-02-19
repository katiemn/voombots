package voombots;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoombotsTests {

	@Test
	public void testFinalLocation() {
		String input1 = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
		assertEquals(Voombots.finalLocation(input1), "1 3 N\n5 1 E");
	}
	
	@Test
	public void testFinalLocation2() {
		String input2 = "10 10\n2 3 W\nMRRMMLMMRMLMMMRMMLMR\n8 4 S\nRMMMMLMMRM\n9 1 N\nMMLMRMLMMMRMMMLL";
		assertEquals(Voombots.finalLocation(input2), "6 9 E\n3 2 W\n5 7 S");
	}
	
	@Test
	public void testFinalLocation3() {
		String input3 = "5 4\n0 0 W\nRMMMRMMLMRRMMMMRMMR";
		assertEquals(Voombots.finalLocation(input3), "0 0 N");
	}
}

