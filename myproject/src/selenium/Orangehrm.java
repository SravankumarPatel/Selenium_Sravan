package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Orangehrm {
	WebDriver driver;
	
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Pls Enter Password");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}
	public void admin() {
		//verification of click event menu options
				driver.findElement(By.id("menu_admin_viewAdminModule")).click();
				driver.findElement(By.id("menu_admin_UserManagement")).click();//sub link
				driver.findElement(By.id("menu_admin_viewSystemUsers")).click();//link

	}
	public void add_user_management() {
		//verify click add button
		driver.findElement(By.id("btnAdd")).click();
		//select items in drop down list option
		new Select(driver.findElement(By.id("systemUser_userType"))).selectByValue("1");
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Sravankumar");
		driver.findElement(By.id("systemUser_userName")).sendKeys("Sravan");
		new Select(driver.findElement(By.id("systemUser_status"))).selectByValue("1");//select drop
		driver.findElement(By.id("systemUser_password")).sendKeys("123456");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("123456");
		driver.findElement(By.id("btnSave")).click();
		System.out.println("invalid username");

	}
	public void leave() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_viewLeaveList")).click();
		driver.findElement(By.id("calFromDate")).click();
		driver.findElement(By.id("calFromDate")).clear();
		driver.findElement(By.id("calFromDate")).sendKeys("2018-06-07");
		driver.findElement(By.id("calToDate")).clear();
		driver.findElement(By.id("calToDate")).sendKeys("2018-09-07");
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.linkText("Logout")).click();
		}
	public static void main(String[] args) {
		Orangehrm obj = new Orangehrm();
		obj.Login();
		obj.admin();
		obj.add_user_management();
		obj.leave();
	}
}
