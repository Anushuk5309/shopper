package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.get("https://www.facebook.com/");
	driver.get("https://www.amazon.in/");
	/*driver.findElement(By.id("email")).sendKeys("anushuk123");
	driver.findElement(By.id("pass")).sendKeys("975359524824");
	driver.findElement(By.name("login")).click();*/
	WebElement ele = driver.findElement(By.xpath("//a[.='Fresh']"));
	WebDriverWait wait=new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.titleContains("india"));
	//wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
	//System.out.println(driver.getTitle());
	
	wait.until(ExpectedConditions.visibilityOf(ele)).click();
	System.out.println(driver.getCurrentUrl());
}
}
