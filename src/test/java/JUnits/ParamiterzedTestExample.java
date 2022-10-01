package JUnits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamiterzedTestExample {
	@ValueSource(strings = {"radar","mom","dad"})
	@ParameterizedTest
	public void test1(String arg1) {
		assertTrue(StringFunctions.isPalindrom(arg1));
		
	}
	@CsvSource(value = {"radar:radar:this is compare"},delimiter = ':')
	@ParameterizedTest
	public void test2(String arg1,String arg2,String arg3) {
		assertEquals(arg1,arg2,arg3);
		
	}
	
}
