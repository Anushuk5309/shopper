package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttons 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/button");
	Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn3']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn5']")).click();
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();
}
}
