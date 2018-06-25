package junit;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Sample3 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("hi.........");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("by............");
	}

	@Test
	void test() {
		System.out.println("welcome sravankumar patel");
	}
	@Test
	 void test1() {
		System.out.println("welcome dev");
	}
	@Test
	public static void test2() {
		System.out.println("welcome kittu");
	}

}
