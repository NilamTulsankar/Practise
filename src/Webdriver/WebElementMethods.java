package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//1. sendkeys
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Mobiles");
		
		//2. click()
		WebElement customerService = driver.findElement(By.xpath("//a[text()='Customer Service' and @tabindex='0' ]"));
		customerService.click();
		
		//3. isEnabled()
		WebElement signInAcc = driver.findElement(By.xpath("//a[@data-nav-role='signin' and @tabindex='0' ]"));
		
		if(signInAcc.isEnabled()) 
		{
			System.out.println("signInAcc button is enabled");
		}else 
		{
			System.out.println("signInAcc button is not enabled");
		}
		
		//4. isDisplayed
		WebElement signINbutton = driver.findElement(By.xpath("//span[text()='Sign in']"));
		if(signINbutton.isDisplayed()==true) 
		{
			System.out.println("  it is displayed   ");
		}else 
		{
			System.out.println("  it is not displayed   ");
		}
		
		System.out.println("signInButton is displayed "+signINbutton.isDisplayed());
		
		
		//5. isSelected
		WebElement SignIn = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println("sign in element is selected "+ SignIn.isSelected());
		
		//6. gettext()
		WebElement Kichen = driver.findElement(By.xpath("//a[@tabindex='0' and @data-csa-c-slot-id='nav_cs_7']"));
		System.out.println(Kichen.getText());
		
		//7. getattribute
		WebElement searchbox1 = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		System.out.println(searchbox1.getAttribute("id"));
		
		//facebook
//		//8. multipleElement
//		List<WebElement> element = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
//		for(int i=0; i<element.size(); i++) 
//		{
//			System.out.println(i+"     "+element.get(i).getText());
//		}
		
		//8. multipleElement
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		System.out.println(elements.size());
		
		for(int i=0; i<elements.size(); i++) 
		{
			String singleElement = elements.get(i).getAttribute("href");
			System.out.println(singleElement);
		}
		
		//close()
		driver.close();
		
	}
}
