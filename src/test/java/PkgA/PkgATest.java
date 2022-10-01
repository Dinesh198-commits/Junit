package PkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import JUnits.StringFunctions;


public class PkgATest {
	@Tag("Sanity")
	@Test
	@DisplayName("Part of package A")
	public void test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	@Tag("Regression")
	@Test
	@DisplayName("Part of package A test 2")
	public void test2() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
