package junit;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Test2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi......");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("By.......");
	}

	@Test
	void test() {
		System.out.println("I am Pulla sravankumar patel");
		
	}
	void test2() {
		System.out.println("cdwufhowuf");
	}

}
