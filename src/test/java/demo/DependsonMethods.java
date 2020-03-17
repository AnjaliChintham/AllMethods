package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods
{
	@Test
	public void logIn()
	{
		System.out.println("login");
	}
	@Test(dependsOnMethods= {"logIn"})
	public void search()
	{
		System.out.println("Search");
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logOut()
	{
		System.out.println("Logout");
	}
}
