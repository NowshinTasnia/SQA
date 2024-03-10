package StringManipulatorPackage;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSMC3 {
	StringManipulatorClass3 smc3 = new StringManipulatorClass3();
	
	@Test
	public void testIsPalindrome()
	{
		assertTrue(smc3.isPalindrome("ma'am"));
	}
	@Test
	public void testRemoveExtraSpaces()
	{
		assertEquals("nowshin is a good girl", smc3.removeExtraSpaces(" nowshin  is a good girl "));
	}
}
