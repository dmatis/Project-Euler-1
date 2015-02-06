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
	public void testCheckPrime() {
		assertFalse(MathFunctions.checkPrime(1));
		assertTrue(MathFunctions.checkPrime(2));
		assertTrue(MathFunctions.checkPrime(29));
		assertFalse(MathFunctions.checkPrime(111));
	}

	@Test
	public void testCheckPalandrome(){
		assertTrue(MathFunctions.checkPalandrome(191));
		assertTrue(MathFunctions.checkPalandrome(18899881));
		assertFalse(MathFunctions.checkPalandrome(12));
		assertFalse(MathFunctions.checkPalandrome(1987657891));
	}
}
