package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indian_Army {
	WebDriver driver;
		 void army() throws InterruptedException {
			
			//set property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.get("https://indianarmy.nic.in/index.aspx");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@href='Default3.aspx?MenuId=VR236967ZGauZ4QhCcqwtA==']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@id='UserMenu1_rep1_ctl00_hpl1']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Indian_Army i = new Indian_Army();
		i.army();

	}

}
