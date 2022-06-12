package Pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//1. sometimes we can drag and drop
		//2. we can not inspect the element og alert popup
		//3. it mainly contain ok btn, cancel btn and text
		//4. it contain question mark and exclamatory marks
		//5. to handle this pop up we need to focus in selenium from main page to alert interface
		//to click on ok btn ==> accept(), cancel btn ==> dismiss methos and get text==> gettext method are available in alert interface
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();
		
	}

}
