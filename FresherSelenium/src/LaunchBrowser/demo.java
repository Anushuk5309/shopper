package LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class demo {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("phone"));
	ele.sendKeys("7896543223");
	Thread.sleep(1000);
	WebElement ele1 = driver.findElement(By.xpath("//select[@id='select2']"));
	Select sel=new Select(ele1);
	sel.selectByIndex(0);
//	Thread.sleep(1000);
	WebElement ele2= driver.findElement(By.xpath("//select[@id='select3']"));
	Select l=new Select(ele2);
	sel.selectByIndex(0);
	Thread.sleep(1000);
	WebElement ele3 = driver.findElement(By.id("//select[@id='select5']"));
	Select t=new Select(ele3);
	sel.selectByIndex(1);
	Thread.sleep(1000);
	WebElement ele4 = driver.findElement(By.id("//select[@id='optionCity']"));
	Select p=new Select(ele4);
sel.selectByIndex(1);
	Thread.sleep(1000);
	driver.close();
}

}
