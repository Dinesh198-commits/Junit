package JUnits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitAnnotations {
	
	@BeforeAll
	public static void BeforeAllJUnit() {
		System.out.println("Before all JUnit");
	}
	
	
	@BeforeEach
	public void BeforeJUnit() {
		System.out.println("Before each JUnit");
	}
	
	
	@Test
	public void test1() {
		assertEquals(11,Calculator.add(6, 5));}
	
	@AfterEach
	public void AfterJUnit() {
		System.out.println("After each JUnit");
	}
	
	@AfterAll
	public static void AfterAllJUnit() {
		System.out.println("After all JUnit");
	}
	

}
