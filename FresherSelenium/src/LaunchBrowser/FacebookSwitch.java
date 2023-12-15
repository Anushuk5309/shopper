package LaunchBrowser;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class FacebookSwitch 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anushuk@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("7090649860");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
   		r.keyPress(KeyEvent.VK_T);
   		r.keyRelease(KeyEvent.VK_T);
   		r.keyRelease(KeyEvent.VK_CONTROL);
   		Set<String> Allwhs = driver.getWindowHandles();
        ArrayList<String> l1 = new ArrayList<String>(Allwhs);
 	    String h=l1.get(1);
 	    driver.switchTo().window(h);
 	    Thread.sleep(1000);
 	    driver.get("https://www.google.com/?gws_rd=ssl");;
 	    Thread.sleep(1000);
 	    driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Kannada");
 	    r.keyPress(KeyEvent.VK_ENTER);
 	    r.keyRelease(KeyEvent.VK_ENTER);
 	    Thread.sleep(1000);
 	    String w1= l1.get(0);
 	    driver.switchTo().window(w1);
 	    Thread.sleep(1000);
 	    driver.close();
 	   driver.switchTo().window(h);
	    Thread.sleep(1000);
	    driver.close();

		
	}
	
}
