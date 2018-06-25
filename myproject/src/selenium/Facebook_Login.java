package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Login {
	void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravan\\Downloads\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver d=new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		d.findElement(By.id("loginbutton")).click();
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		d.findElement(By.id("email")).sendKeys("fgyfgigfiw");
		d.findElement(By.id("loginbutton")).click();
		d.findElement(By.id("email")).sendKeys("sravankumar0458@gmail.com");
		//d.findElement(By.id("pass")).sendKeys("ammananna143");
		d.findElement(By.id("loginbutton")).click();
		d.findElement(By.id("pass")).sendKeys("patelsfamily");
		d.findElement(By.id("loginbutton")).click();
	    d.findElement(By.className("_1vp5")).click();
	   // d.findElement(By.id("u_0_c")).click();
		d.findElement(By.id("userNavigationLabel")).click();
		d.findElement(By.className("_54nh")).click();
	}

	public static void main(String[] args) {
		Facebook_Login f=new Facebook_Login();
		f.login();
	}

}
