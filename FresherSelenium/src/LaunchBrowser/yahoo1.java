package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("Bangaluru");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Bengaluru']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("Mysuru");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[.='Mysuru']")).click();
//	
}
}
