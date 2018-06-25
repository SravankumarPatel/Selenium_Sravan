package junit;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	public  void test() {
		driver.findElement(By.id("loginbutton")).click();
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		driver.findElement(By.id("email")).sendKeys("fgyfgigfiw");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("email")).sendKeys("sravankumar0458@gmail.com");
		//d.findElement(By.id("pass")).sendKeys("ammananna143");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("pass")).sendKeys("patelsfamily");
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.id("u_0_3")).click();
		//className("_1vp5")).click();
	   // d.findElement(By.id("u_0_c")).click();
		//driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.className("_54nh")).click();

	}

}
