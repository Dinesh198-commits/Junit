package PkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import JUnits.StringFunctions;

public class PkgBTest {
	@Tag("Regression")
	@Test
	@DisplayName("Part of package B")
	public void test1() {
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
