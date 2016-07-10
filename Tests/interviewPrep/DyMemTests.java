package interviewPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class DyMemTests {

	@Test
	public void test() {
		DynamicAndMemo dyMemTests = new DynamicAndMemo();
		int coinArray[] = {1,2,3};
		int coinsToCount = 3;		
		assertTrue(dyMemTests.coins(coinArray, coinsToCount) == 1);
		int [] lengthPrice = {1,5,8,9,10,17,17,20};
		assertTrue(dyMemTests.cutRod(lengthPrice, 8) == 22);
		
		int [] itemsvals = {10,40,30,50};
		int [] itemweight = {3,6,4,8};
		
		System.out.println(dyMemTests.oneZeroKnapSack(itemsvals, itemweight, 7));
	}

}
