package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test
	public void test3() throws InterruptedException
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
