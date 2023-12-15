package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Youtube1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf trailer");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@id='video-title']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='segmented-dislike-button']")).click();
    driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
    Thread.sleep(2000);
    driver.close();
}
}
