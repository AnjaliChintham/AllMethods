package demo;

import org.testng.annotations.Test;

public class DependsonGroups
{
	 @Test(groups= {"functional testing","Smoke testing"})
	  public void logIn() 
	  {
		  System.out.println("Testcase1");
	  }
	  @Test(groups= {"functional Testing","sanity testing"})
	  public void search() 
	  {
		  System.out.println("Testcase2");
	  }
	  @Test(groups= {"regressiontesting","retesting"})
	  public void logOut()
	  {
		  System.out.println("Testcase3");
	  }
}
