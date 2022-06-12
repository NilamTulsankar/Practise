package UtilityClassCreation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass 
{
	public static void createBorder(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);	
	}
	
	public static String getTitle(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return(title);
	}
	
	public static void click(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refresh(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0);");	
	}
	
	public static void alertpopup(WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+"page is refreshed "+"')");
	}
	
	public static void scrollDown(WebDriver driver, int x, int y) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(x, y)");	
	}
	
	public static void scrollUp(WebDriver driver, int x, int y) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(x, y)");	
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);	
	}
	
	
	
	
	
	
}
