package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice {

	@BeforeClass
	
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("before method");
	}
	
	@Test(priority=0,invocationCount=2,timeOut=2000)
	
	public void test1() throws InterruptedException
	{
		System.out.println("test 1");
		
		Thread.sleep(6000);
	}
	
	@Test(priority=1,dependsOnMethods= {"test1"})
	
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	
	public void afterclass()
	{
		System.out.println("afterclass");
	}
}
