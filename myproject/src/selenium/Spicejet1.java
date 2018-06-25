package selenium;

	
	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Spicejet1 {
		WebDriver driver;
		void browser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.spicejet.com");
	driver.manage().window().maximize();
		}
		void alerts()  {
			driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
			driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Agartala (IXA)')]")).click();
			driver.findElement(By.xpath("//html//div[@class='right1']//ul[1]/li[3]/a[1]")).click();
			driver.findElement(By.xpath("//html//div[@class='ui-datepicker-group ui-datepicker-group-first']//tr[4]/td[4]/a[1]")).click();
			driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
			//driver.findElement(By.id("divpaxinfo")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[6]/div[3]/div[4]/input[1]")).click();
			
			
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			Spicejet1 s=new Spicejet1();
	          s.browser();
	          s.alerts();
		}

	}



