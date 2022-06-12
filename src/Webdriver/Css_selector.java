package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		//1. tagname and id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//2. tagname and class
		driver.findElement(By.cssSelector("span.navFooterDescText "));
		
		//3. tagname and attribute
		driver.findElement(By.cssSelector("input[name='field-keywords']"));
		
		//4. tagname class and attributes
		driver.findElement(By.cssSelector("span.action-inner[width='50px']"));

	}

}
