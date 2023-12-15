package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/link");
	Thread.sleep(2000);
	 driver.findElement(By.cssSelector("a[href='/link/payment']")).click();
	 Thread.sleep(2000);
	 driver.getTitle();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();
}
}
