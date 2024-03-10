package StringManipulatorPackage;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSMC1 {
	StringManipulatorClass1 smc1 = new StringManipulatorClass1();
	@Test
	public void testCalculateStringLength()
	{
		assertEquals(7, smc1.calculateStringLength("nowshin"));
	}
	@Test
	public void testCalculateStringLengthWithSpace()
	{
		assertEquals(8, smc1.calculateStringLength("nowshin "));
	}
	@Test
	public void testReverseString()
	{
		assertEquals("nihswon", smc1.reverseString("nowshin"));
	}
	@Test
	public void testToLowerCase()
	{
		assertEquals("nowshin", smc1.toLowerCase("NOWSHIN"));
	}
	@Test
	public void testCountOccurrencesCaseSensitive()
	{
		assertEquals(3, smc1.countOccurrences("My name is Nowshin. Now I am doing Lab.", 'n'));
	}
	@Test
	public void testCountOccurrencesCaseInsensitive()
	{
		assertEquals(3, smc1.countOccurrences("My name is Nowshin. Now I am doing Lab.", 'n'));
	}
}
