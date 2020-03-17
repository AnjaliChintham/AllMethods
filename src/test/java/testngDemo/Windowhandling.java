package testngDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
      Set<String> winHandles=driver.getWindowHandles();
      System.out.println("the number of window handles are:" +winHandles.size());
      for(String winHandle:winHandles) 
      {
    	  driver.switchTo().window(winHandle);
      }
      String title=driver.getTitle();
      System.out.println("The page title is:"+title);
      driver.quit();
      
	}

}
