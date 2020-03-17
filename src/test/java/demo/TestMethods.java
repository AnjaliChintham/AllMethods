package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethods 
{
	@Test
	public void testCase1()
	{
		System.out.println("test1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("test2");
	}
	@Test
	public void testCase3()
	{
		System.out.println("test3");
	}
	@Before
	public void beforeMethod()
	{
		System.out.println("Before Method:Launch App");
	}
	@After
	public void AfterMethod()
	{
		System.out.println("AfterMethod:close App");
	}
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before Class:Prepare Test data");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After class:clear log");
	}
	

}



