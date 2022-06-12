package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//1.  Drawing line around the element
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.switchTo().frame("iframeResult");
//		
//		WebElement tryItBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='3px solid red'", tryItBtn);
		
		// 2. click on element
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", tryItBtn);
		
		// 3. get title
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
		// 4. create an alert popup
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("alert('"+ "popup is generated "+"')");
		
//		//5. refresh page
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("history.go(0);");
		
		//6 Scroll ==> scroll up/ scroll down/ scrollintoview
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scroll down
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1000)");
		
		Thread.sleep(2000);
		// scroll up
		js.executeScript("scroll(0, 200)");
		
		
		//scroll into view
		WebElement tryitbtn = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		js.executeScript("arguments[0].scrollIntoView", tryitbtn);
		tryitbtn.click();
		
		
	}

}
