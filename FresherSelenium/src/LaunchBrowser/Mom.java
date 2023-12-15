package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mom 
{
public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/Power.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("google")).click();
}
}
