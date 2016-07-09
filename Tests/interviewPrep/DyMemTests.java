package interviewPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class DyMemTests {

	@Test
	public void test() {
		DynamicAndMemo dyMemTests = new DynamicAndMemo();
		
		int coinArray[] = {1,2};
		int coinsToCount = 3;		
		System.out.print(dyMemTests.coins(coinArray, coinsToCount));
		int [][] lengthPrice = new int[2][7];
		System.out.println(lengthPrice.length);

	}

}
