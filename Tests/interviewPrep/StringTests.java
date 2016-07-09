package interviewPrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTests {

	@Test
	public void test() {
	StringQuestions UnitTest = new StringQuestions();
	String aabbcdd = "aabbcdd";
	
	assertTrue(UnitTest.nonRepeater(aabbcdd) == 'c');
	assertTrue(UnitTest.reverseIterative(aabbcdd).equals("ddcbbaa"));
	assertTrue(UnitTest.reverseRecursionString(aabbcdd).equals("ddcbbaa"));
	assertTrue(UnitTest.anagram("TomMarvoloRiddle", "IamLordVoldemort"));
	assertFalse(UnitTest.anagram("HarryPotter", "IamLordVoldemort"));
	
	assertTrue(UnitTest.palindrome("racecar"));
	assertFalse(UnitTest.palindrome("wally"));
	assertTrue(UnitTest.palindrome_slick("racecar"));
	assertTrue(UnitTest.uniqueChars("abcde"));
	assertFalse(UnitTest.uniqueChars("aardvark"));
	
	}
}
