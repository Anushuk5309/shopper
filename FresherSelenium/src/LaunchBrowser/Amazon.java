package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung galaxy");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='s-image']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
	
}
}
