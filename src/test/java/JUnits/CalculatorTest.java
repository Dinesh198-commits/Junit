package JUnits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
	@Test
	public void test1() {
		assertEquals(11,Calculator.add(6, 5));
		
	}
	@Test
	public void test2() {
		assertEquals(1,Calculator.sub(6, 5));}

}
