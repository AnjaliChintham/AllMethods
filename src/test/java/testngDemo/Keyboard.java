package testngDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard 
{

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Selenium Java\\Google Chrome Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			Actions act=new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys("hello").perform();
			act.sendKeys(Keys.RETURN).perform();
		}
}
