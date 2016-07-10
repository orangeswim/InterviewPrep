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
		
		int [] itemsvals = {10,4,9,11};
		int [] itemweight = {3,8,9,8};
		
		System.out.println(dyMemTests.oneZeroKnapSack(itemsvals, itemweight, 20));
		
		int [] arr = new int [1001];
		System.out.println(dyMemTests.memoFib(1000, arr));
	}

}
