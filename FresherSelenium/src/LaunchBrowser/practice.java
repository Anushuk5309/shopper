package LaunchBrowser;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/anushuk.html");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//input"));
	int count =  links.size();
	System.out.println(count);
	for(WebElement b:links);
	{
		for(int i=count-1; i>=0;i--)
		{
			WebElement b1=links.get(i);
			b1.clear();
			Thread.sleep(2000);
		}
	}
	
}
}



