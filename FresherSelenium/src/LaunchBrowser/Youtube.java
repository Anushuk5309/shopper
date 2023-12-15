package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[id='video-title']")).click();
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);
	    driver.close();
	}
	}
