package interviewPrep;

import static org.junit.Assert.*;

import org.junit.Test;

import interviewPrep.GeneralQuestions;

public class GeneralTests {

	@Test
	public void test() {

		
		GeneralQuestions Test = new GeneralQuestions();
		int [] testIntegerFrequent = {0,1,2,3,1,1,4,2};
		
		assertTrue(Test.frequentInt(testIntegerFrequent) == 1);
		
	}

}
