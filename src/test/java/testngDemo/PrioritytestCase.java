package testngDemo;

import org.testng.annotations.Test;

public class PrioritytestCase {
	@Test(priority=2)
	public void testCase1()
	{
		System.out.println("test1");
	}
	@Test(priority=3,invocationCount=3,invocationTimeOut=5)
	public void testCase2()
	{
		System.out.println("test2");
	}
	@Test(priority=1)
	public void testCase3()
	{
		System.out.println("test3");
	}
}