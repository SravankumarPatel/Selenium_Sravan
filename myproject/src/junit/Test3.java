package junit;

//import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hi......");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("By.......");
	}

	@Test
	public void test() {
		System.out.println("I am Pulla sravankumar patel");
	}

}
