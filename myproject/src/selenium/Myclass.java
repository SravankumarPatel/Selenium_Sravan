package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("_3ac-")).click();
		driver.findElement(By.className("selected ng-binding")).click();
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		driver.findElement(By.name("username")).sendKeys("9110323080");
		driver.findElement(By.name("password")).sendKeys("143apple");
		driver.findElement(By.name("md-raised md-primary btn-new mt-20 login-btn md-button ng-scope md-default-theme")).click();
		}

}
