package TestPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Browser;
import Utility.Screenshot;
import PomPackage.LoginPage;
import PomPackage.HomePage;

public class TestClassA extends Browser{
	
	WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass() throws InterruptedException 
	{
		
	
		WebDriver driver = Browser.OpenChromeBrowser();
		
		this.driver=driver; 
		
		Thread.sleep(2000);
		
   /*  System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize(); */
		
	
		
	}
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=0,invocationCount=2) 
	
	public void loginPage()
	{
		LoginPage login=new LoginPage(driver);
		
		login.sendUserName();
		login.sendpassword();
		login.clickOnLoginButton();
	}
	
	 @Test(priority=1)
	
	public void HomePage() throws IOException, InterruptedException
	{
	     HomePage home=new HomePage(driver);
	     home.verifyAdminTab();
	     home.verifyPIMTab();
	     home.verifyLeaveTab();
	    // Screenshot.CaputureScreenshot(driver);
	     Thread.sleep(2000);
	     
	     driver.navigate().back();
	   
	     
	/*   Assert.assertEquals(ExpectedURL,ActualURL);
	     Assert.assertNotEquals(ExpectedURL, ActualURL);
	     Assert.assertTrue(result);
	     Assert.assertFalse(Result);
	     Assert.fail();
	     
	     SoftAssert s=new SoftAssert();
	     s.assertEquals(Expected, Actual);
	     s.assertNotEquals(Expected, Actual);
	     s.assertTrue(result);
	     s.assertFalse(result);
	     s.assertAll();  */
	     
	}
}
	
	//Hard Assert
	
	
