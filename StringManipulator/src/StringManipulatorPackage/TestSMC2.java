package StringManipulatorPackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSMC2 {
	StringManipulatorClass2 smc2 = new StringManipulatorClass2();
	@Test
	public void testCapitalizeWords()
	{
		assertEquals("Nowshin Is A Good Girl.", smc2.capitalizeWords("noWSHin is a gOOD giRL."));
	}
	@Test
	public void testRemoveNonAlphabetic()
	{
		assertEquals("NowshinaCSEstudentisnowdoingLAB", smc2.removeNonAlphabetic("Nowshin, a CSE student, is now doing LAB."));
	}
	@Test
	public void testContainsSubstring()
	{
		assertTrue(smc2.containsSubstring("nowshin", "no"));
	}
	@Test
	public void testMergeStrings()
	{
		assertEquals("nowshin is a good girl.", smc2.MergeStrings("nowshin", " is a good girl."));
	}
	@Test
	public void testReverseWords()
	{
		assertEquals("girl good a is nowshin", smc2.reverseWords("nowshin is a good girl"));
//		assertEquals("nihswon", smc2.reverseWords("nowshin"));
	}
}
