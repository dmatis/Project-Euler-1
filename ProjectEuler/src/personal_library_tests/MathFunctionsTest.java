package personal_library_tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import personal_library.MathFunctions;

public class MathFunctionsTest {
	
	int x;
	int y;
	
	@Before
	public void runBefore(){
		// Redundant for clarity 
		x = 0; 
		y = 0; 
	}


	@Test
	public void test() {
		assertFalse(MathFunctions.checkPrime(1));
		assertTrue(MathFunctions.checkPrime(2));
		assertTrue(MathFunctions.checkPrime(29));
		assertFalse(MathFunctions.checkPrime(111));
	}

}
