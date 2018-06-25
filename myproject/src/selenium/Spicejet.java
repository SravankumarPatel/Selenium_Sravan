package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {
	WebDriver driver;

	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
	}

	void tour() {
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Hyderabad (HYD)')]")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//html//div[@class='right1']//div[@id='dropdownGroup1']//ul[2]/li[2]/a[1]"))
				.click();
		driver.findElement(
				By.xpath("//html//div[@class='ui-datepicker-group ui-datepicker-group-first']//tr[4]/td[5]/a[1]"))
				.click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		// driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[6]/div[3]/div[1]/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		/*
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 */

		// driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();

		// driver.findElement(By.xpath("//div[@id='divAdult']//div[@class='ad-row-right']")).click();

	}
	/*
	 * public void add_ons() throws InterruptedException { Actions a=new
	 * Actions(driver);
	 * a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().
	 * perform(); Thread.sleep(2000);
	 * 
	 * driver.findElement(By.partialLinkText("Hot Meals")).click();
	 * a.moveToElement(driver.findElement(By.xpath("//span[@class='burger-bread']"))
	 * ).build().perform();
	 * //a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	 * //Thread.sleep(1000);
	 * //a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	 * 
	 * 
	 * //XPath.//input[@name='pass'][@class='inputtext'] //again hovering to add-ons
	 * //a.moveToElement(driver.findElement(By.id("highlight-addons"))).build().
	 * perform(); //a.moveToElement(driver.findElement(By.
	 * partialLinkText("SpiceClub Membership Offer"))).build().perform();
	 * 
	 * }
	 */ /*
		 * public void Login() { Actions b=new Actions(driver);
		 * b.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().
		 * perform();
		 * 
		 * }
		 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Spicejet sp = new Spicejet();
		sp.browser();

		// sp.Login();
		sp.tour();
		// sp.add_ons();

	}

}
