package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tinyupload.com");
		driver.findElement(By.name("upload_file")).sendKeys("C:\\Users\\BLTuser.BLT52\\Desktop\\testcase.txt\\");
		driver.findElement(By.xpath(" "));
	}
}
