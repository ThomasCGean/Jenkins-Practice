package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAdd() {
		MathUtils test = new MathUtils();
		int result = test.add(5,3);
		assertEquals(8, result);
	}
	
	void testMult() {
		MathUtils test = new MathUtils();
		int result = test.multiply(2,5);
		assertEquals(10, result);
	}
	
	void testDiv( ) {
		MathUtils test = new MathUtils();
		double result = test.divide(10, 2);
		assertEquals(5, result);
	}
		
	void testDivZero( ) {
		MathUtils test = new MathUtils();
		double result = test.divide(5, 0);
		assertEquals(-1, result);
			
	}
	
	void testSubtract( ) {
		MathUtils test = new MathUtils();
		int result  = test.subtract(12, 1);
		assertEquals(11, result);
		
	}
	

}
