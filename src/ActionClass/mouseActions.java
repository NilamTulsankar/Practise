package ActionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouseActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Action class
		//this is inbuilt feature provided by selenium used to perform some mouse action and keyboard action
		//we can perform various mouse action such as click, double click, right click, hover the element, drag and drop also we can perform keyboard action such as sendkeys etc
		
		// .biuld() :- this method is used to combine multiple actions in single statment
		// .perform() :- this method is used to execute ech method
		
		//Mouse action
		//1. click() -- this is used to perform mouse left click action
		//2. contextclick() -- this is used to perform right click action 
		//3. double click() -- it is used to double click action
		//4. moveToElement -- it is used to move mouse pointer to center of the element
		//5. resizable 
		//6. drag and drop -- it is used to perform drag and drop action
		//7. draggable
		
		//keyboard action
		// 1. sendkeys -- it is used to send pass some text
		// 2. key up -- it is used to release the key
		// 3. key down -- it is used to press the keys
		Actions action;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Selenium  all jar files\\chrome102\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1. click()
//		WebElement bestselbtn = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		action = new Actions(driver);
//		action.click(bestselbtn);
//		action.build().perform();
//		
//		//2. double click();
//		action.doubleClick(bestselbtn);
//		action.build().perform();
//		
//		//3. right click
//		action.contextClick(bestselbtn);
//		action.build().perform();
		
		//4. hover the elements
		List<WebElement> allelemnets = driver.findElements(By.xpath("//div[@id='nav-xshop']//a"));
		
		for (int i=0; i<allelemnets.size(); i++) 
		{	WebElement sinleElement = allelemnets.get(i);
			action.moveToElement(sinleElement);
			action.build().perform();
			String text = sinleElement.getText();
			System.out.println(i+"  "+text);
			Thread.sleep(2000);
		}
		
		//how can resizable 
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement Button = driver.findElement(By.xpath("//div[contains(@class, 'ui-icon ui-icon-gripsmall')]"));
		action = new Actions(driver);
		action.dragAndDropBy(Button, 150, 20);
		action.build().perform();
	
		//draggable
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		action = new Actions(driver);
		action.dragAndDropBy(draggable, 50, 30);
		action.build().perform();
		
		
		//drag and drop
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame0 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame0);
		
		WebElement draggable1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drappable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action = new Actions(driver);
		action.dragAndDrop(draggable1, drappable);
		action.build().perform();
		
		driver.quit();
	}
	


}
