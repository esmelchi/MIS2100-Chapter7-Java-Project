package Melchiori.Emma.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleMathTest {


		
	

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath MathObject = new SimpleMath();
		assertEquals(0, MathObject.divide(0, 7), 0.0001);
	
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath MathObject1 = new SimpleMath();
		assertEquals(0.25, MathObject1.divide(1, 4), 0.0001);
	}

	@Test(expected = ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath MathObject2 = new SimpleMath();
		MathObject2.divide(6, 0);
		
	}


}

