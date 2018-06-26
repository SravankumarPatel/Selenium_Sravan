package Selenium.Automation;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;

import java.sql.Driver;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

//import java.awt.dnd.DragGestureRecognizer;
//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class AdminTest {
	WebDriver driver;
  @Test
  public void HospitalRegistation() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("2");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("Sravankumar Hospitals");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("Hyderabad ");
	  Select Hospitalregistration_yearofestablishment=new Select(driver.findElement(By.name("Hospitalregistration[yearofestablishment]")));
	  Hospitalregistration_yearofestablishment.selectByValue("1902");
	  driver.findElement(By.id("Hospitalregistration_country")).sendKeys("india");
	  driver.findElement(By.id("Hospitalregistration_state")).sendKeys("Hyderabad");
	  driver.findElement(By.id("Hospitalregistration_phone")).sendKeys("9652318301");
	  driver.findElement(By.id("Hospitalregistration_email")).sendKeys("pulla.sravankumaropatel@gmail.com");
	  driver.findElement(By.id("Hospitalregistration_fax")).sendKeys("88888888");
	  driver.findElement(By.id("Hospitalregistration_noofbuildings")).sendKeys("8");
	  driver.findElement(By.id("Hospitalregistration_contactperson")).sendKeys("Chandan Babu");
	  driver.findElement(By.id("Hospitalregistration_promotedby")).sendKeys("Dev");
	  driver.findElement(By.id("Hospitalregistration_logo_em_")).isSelected();
	  
  }
  @Test
  public void Admin() throws InterruptedException {
	  //this is Hsptl Registation
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  driver.findElement(By.xpath("//html//ul[@class='navigation navigation-main navigation-accordion']/li[3]/a[1]")).click();
	  driver.findElement(By.xpath("//a[@href='/index.php/core/hospitalregistration/create']")).click();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("2");
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).clear();
	  driver.findElement(By.xpath("//input[@id='Hospitalregistration_hospital_code']")).sendKeys("Sravankumar Hospitals");
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).clear();
	  driver.findElement(By.xpath("//textarea[@id='Hospitalregistration_address']")).sendKeys("Hyderabad ");
	  driver.findElement(By.id("Hospitalregistration_yearofestablishment")).clear();
	  Select Hospitalregistration_yearofestablishment=new Select(driver.findElement(By.name("Hospitalregistration[yearofestablishment]")));
	  Hospitalregistration_yearofestablishment.selectByValue("1902");
	  driver.findElement(By.id("Hospitalregistration_country")).clear();
	  driver.findElement(By.id("Hospitalregistration_country")).sendKeys("india");
	  driver.findElement(By.id("Hospitalregistration_state")).clear();
	  driver.findElement(By.id("Hospitalregistration_state")).sendKeys("Hyderabad");
	  driver.findElement(By.id("Hospitalregistration_phone")).clear();
	  driver.findElement(By.id("Hospitalregistration_phone")).sendKeys("9652318301");
	  driver.findElement(By.id("Hospitalregistration_email")).clear();
	  driver.findElement(By.id("Hospitalregistration_email")).sendKeys("pulla.sravankumaropatel@gmail.com");
	  driver.findElement(By.id("Hospitalregistration_fax")).clear();
	  driver.findElement(By.id("Hospitalregistration_fax")).sendKeys("88888888");
	  driver.findElement(By.id("Hospitalregistration_noofbuildings")).clear();
	  driver.findElement(By.id("Hospitalregistration_noofbuildings")).sendKeys("8");
	  driver.findElement(By.id("Hospitalregistration_contactperson")).clear();
	  driver.findElement(By.id("Hospitalregistration_contactperson")).sendKeys("Chandan Babu");
	  driver.findElement(By.id("Hospitalregistration_promotedby")).clear();
	  driver.findElement(By.id("Hospitalregistration_promotedby")).sendKeys("Dev");
	  //driver.findElement(By.id("Hospitalregistration_logo_em_")).isSelected();
	  WebElement Hospitalregistration_logo = driver.findElement(By.name("Hospitalregistration[logo]"));
	  //Hospitalregistration_logo.sendKeys( "c:");
	  driver.findElement(By.xpath("//button[@class='btn bg-teal']")).click();


	  //This Is Staff Registation
	  
	  
	 driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	 driver.findElement(By.xpath("//i[@class='icon-plus-circle2']")).click();
	 driver.findElement(By.xpath("//a[@href='/index.php/core/staffregistration/create']")).click();
	 driver.findElement(By.id("Staffregistration_employeetypeid")).click();
	 Select Staffregistration_employeetypeid=new Select(driver.findElement(By.name("Staffregistration[employeetypeid]")));
	 Staffregistration_employeetypeid.selectByValue("81");
	 driver.findElement(By.xpath("//input[@id='Staffregistration_firstname']")).sendKeys("Sravankumar");
	 driver.findElement(By.xpath("//input[@id='Staffregistration_lastname']")).sendKeys("Pulla");
	 Select Staffregistration_gender=new Select(driver.findElement(By.name("Staffregistration[gender]")));
	 Staffregistration_gender.selectByValue("1");
	 driver.findElement(By.id("Staffregistration_age")).sendKeys("30 June, 1993");
	 ////div[@id='Staffregistration_age_root']//div[@class='picker__holder']//div[@class='picker__frame']//div[@class='picker__wrap']//div[@class='picker__box']
	 Thread.sleep(2000);
	 Select Staffregistration_bloodgroup=new Select(driver.findElement(By.name("Staffregistration[bloodgroup]")));
	 Staffregistration_bloodgroup.selectByValue("3");
	 driver.findElement(By.xpath("//textarea[@id='Staffregistration_address']")).sendKeys("Hyderabad");
	 Thread.sleep(2000);
	 Select Staffregistration_hospitaldepartmentid=new Select(driver.findElement(By.name("Staffregistration[hospitaldepartmentid]")));
	 Staffregistration_hospitaldepartmentid.selectByValue("58");
	 driver.findElement(By.xpath("//input[@id='Staffregistration_dateofjoining']")).sendKeys("30 May, 2018");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='Staffregistration_dateofretiremnent']")).sendKeys("30 June, 2018");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Staffregistration_email")).sendKeys("sravankumar@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Staffregistration_phone")).sendKeys("9652318301");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Staffregistration_emergency_contact_person")).sendKeys("PrashanthReddy");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Staffregistration_emergency_contact_no")).sendKeys("9652318301");
	 Thread.sleep(2000);
	 driver.findElement(By.id("Staffregistration_relationship")).sendKeys("Friend");
	 Actions a=new Actions(driver);
	 a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@class='btn bg-teal']")).click();
  }
 
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.elixiraid.com/index.php/user/login");
  }

  @AfterClass
  public void afterClass() {
  }

}
