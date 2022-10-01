package JUnits;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionTest {
	@Test
	public void test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	@Test
	public void test2() {
		assertFalse(StringFunctions.isPalindrom("Dinesh"));
	}
	@DisplayName("Example of repeated test")
	@RepeatedTest(4)
	public void test3() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
