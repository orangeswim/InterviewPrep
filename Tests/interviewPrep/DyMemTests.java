package interviewPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class DyMemTests {

	@Test
	public void test() {
		DynamicAndMemo dyMemTests = new DynamicAndMemo();
		int coinArray[] = {1,2};
		int coinsToCount = 3;		
		assertTrue(dyMemTests.coins(coinArray, coinsToCount) == 2);
		int [] lengthPrice = {1,5,8,9,10,17,17,20};
		assertTrue(dyMemTests.cutRod(lengthPrice, 8) == 22);
	}

}
