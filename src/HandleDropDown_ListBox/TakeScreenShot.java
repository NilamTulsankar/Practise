package HandleDropDown_ListBox;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		//to take screenshot in selenium we need typecast driver object to takescreenshot i.e ((takascreenshot)driver)
//		//we need to call method getscreenshotas i.e. getscreenshotAs()
//		//we have to pass the argument (output.type file)
		
//		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Selenium Screenshot\\amazon.jpg");
//		FileUtils.copyFile(scr, destination);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\HP\\Desktop\\Selenium  all jar files\\Selenium Screenshot\\facebook.jpg");
		FileUtils.copyFile(src, dest);
		
		

	
	
	}
}
