package LaunchBrowser;
import java.awt.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon2 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(1000);	
	WebElement ele= driver.findElement(By.xpath("//a[.='Brazil']"));
    int X = ele.getLocation().x;
	int Y = ele.getLocation().y;
    //org.openqa.selenium.Point a = ele.getLocation();
	//System.out.println(a);
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+X+","+Y+")");
	Thread.sleep(2000);
	ele.click();
			
}
}
