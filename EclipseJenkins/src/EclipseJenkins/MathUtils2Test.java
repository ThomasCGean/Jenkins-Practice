package EclipseJenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtils2Test {

	@Test
	void testAddition() {
		MathUtils2 testAdd = new MathUtils2();
		int sum = testAdd.addition(10, 5);
		assertEquals(15,sum);
	}
	@Test
	void testSubtraction() {
		MathUtils2 testSubt = new MathUtils2();
		int difference = testSubt.subtraction(10, 5);
		assertEquals(5, difference);
	}
	@Test
	void testMult() {
		MathUtils2 testMult = new MathUtils2();
		int product = testMult.mult(4, 5);
		assertEquals(20,product);
	}
	@Test
	void testDiv() {
		MathUtils2 testDivide = new MathUtils2();
		double quotient = testDivide.divide(25, 5);
		assertEquals(5,quotient);
	}

}
