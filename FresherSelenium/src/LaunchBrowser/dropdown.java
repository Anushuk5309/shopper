package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/anushuk.html");
	Thread.sleep(1000);
	WebElement drop_down = driver.findElement(By.xpath("//select[@id='city-dropdown']"));
    Select sel=new Select(drop_down);
    if(sel.isMultiple())
    {
    	System.out.println("multi select");
    }
    else
    {
    	System.out.println("single select");
    }
    driver.quit();
    
}
}
