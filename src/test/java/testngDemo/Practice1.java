package testngDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1
{
	WebDriver driver;
	WebDriver driver1;
	@BeforeMethod
	public void logIn()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome jars\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com//");
		driver.manage().window().maximize();
		System.out.println("Login");
				
	}
	@Test
	public void pay()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"main\"]//div//div[13]//div[3]//div[3]//div//div//div//div//div//div//div//div[1]//div[2]//ul//li[2]//a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"main\"]//div//div[13]//div[3]//div[3]//div//div//div//div//div//div//div//div[1]//div[2]//ul//li[2]//ul//li[2]//a//span[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(a);
		act.moveToElement(b).click().build().perform();
		System.out.println("Payment");
	}
	@Test
	public void screeShot() throws IOException
	{	
	TakesScreenshot tst=((TakesScreenshot)driver);
	File Store=tst.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Store,new File("C:\\Users\\BLTuser.BLT52\\eclipse-workspace\\mavenDemo1\\ScreenShots\\.jpg"));
	System.out.println("ScreenShot");
	}
	@Test
	public void search()
	{
		WebElement r=driver.findElement(By.xpath("//*[@id=\"main\"]//div//div[2]//div[3]//div//div//div//div//div//div//div//div[1]//div[2]//ul//li[8]//div//input"));
		Actions act=new Actions(driver);
		act.moveToElement(r).build().perform();
		r.sendKeys("Ramya");
	}
					
	

}
