package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScripttologintoFacebook 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("anushuk25@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Anushuk@1999");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[name='login']")).click();
    driver.getTitle();
    System.out.println(driver.getTitle());
    Thread.sleep(2000);
    driver.close();
}
}
