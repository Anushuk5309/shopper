package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	WebDriver ele = driver;
	ele.get("file:///C:/Users/HP/Desktop/balu.html");
	Thread.sleep(2000);
	 WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
	 Thread.sleep(2000);
	 boolean f = ele1.isDisplayed();
	 if(f)
	 {
		 System.out.println("ele1 is displayed");
	 }
	 else
	 {
		 System.out.println("ele1 is not displayed");
	 }
	
}
}
