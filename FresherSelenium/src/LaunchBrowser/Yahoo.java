package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://login.yahoo.com/?.intl=in");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anush");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='mbr-forgot-link']")).click();
}
}
