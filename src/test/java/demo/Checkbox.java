package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		driver.manage().window().maximize();
		driver.findElement(By.id("small-searchterms")).sendKeys("book");;
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.id("As")).click();
		
	}
}
