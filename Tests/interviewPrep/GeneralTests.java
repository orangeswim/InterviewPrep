package interviewPrep;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import interviewPrep.GeneralQuestions;

public class GeneralTests {

	@Test
	public void test() {
		
		GeneralQuestions Test = new GeneralQuestions();
		
		int [] testIntegerFrequent = {0,1,2,3,1,1,4,2};		
		assertTrue(Test.frequentInt(testIntegerFrequent) == 1);
		
		int [] testAmount = {10,0,0,10,5,5};		
		assertTrue(Test.pairsSorted(testAmount) == 3);
		assertTrue(Test.pairSortedHash(testAmount) == 3);
		
		int [] testA = {1,2,3,5,6,7,8};
		int [] testB = {5,6,7,8,1,2,3};
		int [] testC = {5,6,7,8,1,2,};
		assertTrue(Test.twoIntegerArray(testA, testB));
		assertFalse(Test.twoIntegerArray(testB, testC));
		
		assertTrue(Test.fibnums(10) == 55);
		int [] testD = new int[11]; //automatically initializes to 0.
		assertTrue(Test.fibMemo(10, testD) == 55);
		
		int [] testf = {1,1,2,2,3,4,4};
		int [] testg = {1,3,4,4};
		assertTrue(Test.elementInArrayOnce(testf) == 3);
		int [] twoElementTest = Test.two_elements_of_int_array(testf, testg);
		assertTrue(twoElementTest[0] == 1);
		
		
		int [] testSearch = {1,2,3,4,5,6,7,8,9,10};
		assertTrue(Test.binarySearch(testSearch, 10) == true);
		assertTrue(Test.binarySearch(testSearch, 1) == true);
		assertFalse(Test.binarySearch(testSearch, 20) == true);
		assertTrue(Test.multipleInts(5, 3) == 15);
		
		

	}

}
