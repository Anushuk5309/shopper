package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dash {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("phone"));
	ele.sendKeys("7896543223");
	Thread.sleep(1000);
	WebElement dp = driver.findElement(By.xpath("//select[@id='select2']"));
	Select sel=new Select(dp);
	sel.selectByValue("male");
	Thread.sleep(1000);
	WebElement pc= driver.findElement(By.xpath("//select[@id='select3']"));
	Select l=new Select(pc);
	l.selectByVisibleText("Canada");
	Thread.sleep(1000);
	WebElement qc= driver.findElement(By.id("//select[@id='select5']"));
	Select t=new Select(qc);
	System.out.println(t);
	t.selectByIndex(1);
	Thread.sleep(1000);
	WebElement ele4 = driver.findElement(By.id("//select[@id='optionCity']"));
	Select p=new Select(ele4);
p.selectByIndex(1);
	Thread.sleep(1000);
	driver.close();

}
}
