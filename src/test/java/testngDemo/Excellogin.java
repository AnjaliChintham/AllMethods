package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excellogin
{
	@Test
	public void excel() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream(new File("D:\\Ramya\\Data\\excel1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("data");
		int count=sheet.getLastRowNum();
		System.out.println(count);
		for(int i=1;i<=count;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String un=cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
			String pwd=cell.getStringCellValue();
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Chrome jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com//");
			driver.findElement(By.id("txtUsername")).sendKeys(un);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(5000);
			driver.close();
			
		}
		
	}
}


