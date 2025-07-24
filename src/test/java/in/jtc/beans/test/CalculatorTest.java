package in.jtc.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import in.jtc.beans.Calculator;

public class CalculatorTest {

	private static Calculator calc = null;
	
	@BeforeClass //static method is going to execute in that we are creating the object
	public static void init() {
		calc = new Calculator();
	}
	
	@AfterClass //After all these test cases are completed, destroy() method will execute where we are nullifying the object
	public static void destroy() {
		calc = null;
	}
	
	@Test //represents our method as a Unit Test method
	public void testAdd() {
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;
		
		//Validating the result by Comparing actual result and expected Result
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void testMultiply() {
		Integer actualResult = calc.multiply(10, 10);
		Integer expectedResult = 100;
		
		//Validating the result by Comparing actual result and expected Result
		assertEquals(expectedResult, actualResult);	
	}
}
