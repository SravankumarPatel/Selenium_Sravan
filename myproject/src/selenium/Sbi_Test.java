package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_Test {
	 WebDriver driver;
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[@tabindex='16']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		String str=driver.switchTo().alert().getText();
		driver.close();
		//driver.quit();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sbi_Test s=new Sbi_Test();
		s.Login();

	}

}
