package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
@Test
public void test1() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/Appu.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.tagName("a"));
	ele.click();
	//or
	driver.findElement(By.tagName("a")).click();
	driver.findElement(By.id("a1")).click();
	driver.findElement(By.name("n1")).click();
	driver.findElement(By.className("c1")).click();
}
@Test
public void test2() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/HP/Desktop/Amma.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Hii");
	Thread.sleep(2000);
	driver.findElement(By.id("a1")).sendKeys("Hlo");
	Thread.sleep(2000);
	driver.findElement(By.name("n1")).sendKeys("bye");
	Thread.sleep(2000);
	driver.findElement(By.className("c1")).sendKeys("no");
}
}
