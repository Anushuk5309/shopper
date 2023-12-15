package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kulli 
{
public static void main(String[] args)throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("search_query")).sendKeys("bellada cha");
	driver.getTitle();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.close();
}
}
