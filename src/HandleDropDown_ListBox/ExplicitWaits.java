package HandleDropDown_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnNewsletterSignup']"))).click();
	
		WebDriverWait wait1= new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txtNLSEmailAddress']"))).sendKeys("NILAM");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		String actual = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='nls-title']//h3"))).getText();
		
		System.out.println(actual);
		
		String expectedText = "Want to keep updated with the latest news, including offers, promotions, sale and store events?\r\n"
				+ "Enter your email address below to keep in the loop.";
	
		if(expectedText.equalsIgnoreCase(actual)) 
		{
			System.out.println("Test case ias pass");
		}else 
		{
			System.out.println("test case fail");
		}
	
		
	}

}
