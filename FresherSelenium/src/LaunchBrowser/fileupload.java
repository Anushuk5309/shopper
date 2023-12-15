package LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/anushuk.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement((By.name("upload file")));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\HP\\Documents\\API-soapui-project.xml");
	}
	
}
