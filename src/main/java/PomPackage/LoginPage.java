package PomPackage;

	
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class LoginPage 
	{
         static WebDriver driver;
	     WebDriverWait wait;
	     
	 @FindBy(xpath="//input[@name='username']")
	 private WebElement userName;
	 
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement password;
	 
	 
	 @FindBy(xpath="//button[text()=' Login ']")
	 private WebElement LoginButton;
	 
	 public LoginPage(WebDriver driver)  //constructor created
	 {  
		 wait =new WebDriverWait(driver,Duration.ofSeconds(20)); // no such element exception triggered
		
		 // this.driver=driver;
		 PageFactory.initElements (driver,this);
	 
	 }
	 
	 public void sendUserName()   //Method created non static
	 {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	userName.sendKeys("Admin");
	 }
	 
	 public void sendpassword()
	 {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		 password.sendKeys("admin123");
	 }
	 public void clickOnLoginButton()
	 {
		 LoginButton.click();
	 }

}
