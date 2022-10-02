package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void CaputureScreenshot(WebDriver driver) throws IOException
	{
		 Date currentDate =new Date();
		
		 System.out.println(currentDate);
		
		 String ScreenShot=currentDate.toString().replace(" ", "-").replace(":","-");
		 System.out.println(ScreenShot);
		 
		 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //screenshot store in JVM memory
			
		 File dest=new File("D:\\21_may_C\\"+ScreenShot+".jpeg"); //we gave a path of our system memory"
			
		 FileHandler.copy(source, dest); // copy that screenshot in our system memory from JVM memory
			
	}

}
