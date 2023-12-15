package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqsp 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kgf trailer");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Qsp@gmai.com");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("qsp$123");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("a[type='button']")).click();
	Thread.sleep(2000);
	driver.get("https://demoapps.qspiders.com/button");
	Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn3']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button[id='btn5']")).click();
	 driver.get("https://demoapps.qspiders.com/link");
	 Thread.sleep(2000); 
	 driver.get("https://demoapps.qspiders.com/checkbox");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='mode']")).click();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/radio");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='home']")).click();
		 Thread.sleep(2000);
	 driver.getTitle();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();
}
}
