package LaunchBrowser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fb2
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(1000);
	WebElement drop_down = driver.findElement(By.id("month"));
	Select sel=new Select(drop_down);
    List<WebElement>opt=sel.getOptions();
    ArrayList<String>l=new  ArrayList<String>();
    int count = opt.size();
    System.out.println(count);
    for(WebElement we:opt)
    {
    	String text = we.getText();
    	l.add(text);
    }
    Collections.sort(l);
    for(String l1:l)
    {
    	System.out.println(l1);
    }
    System.out.println(l);
     driver.close();
}
}
