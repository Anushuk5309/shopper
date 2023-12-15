package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//span[.='26'])"));
     ele.sendKeys(Keys.ENTER);
     Thread.sleep(3000);
     
}

}
