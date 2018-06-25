package junit;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeEach
	public static void setUp() throws Exception {
		System.out.println("Hi......");
	}

	@AfterEach
	public static void tearDown() throws Exception {
		System.out.println("by");
	}

	@Test
	public static void test() {
		System.out.println("I am Sravankumar Patel");
	}

}
