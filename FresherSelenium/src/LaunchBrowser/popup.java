package LaunchBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(1000);
	driver.findElement(By.name("NewTab")).click();
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	int count=allwh.size();
	System.out.println(count);
	for (String wh : allwh) 
	{
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}

}
