package demo;

import org.testng.annotations.Test;

public class ParallelExecution 
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

}
