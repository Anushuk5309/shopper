package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Appu
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	String a=driver.getTitle();
	Thread.sleep(2000);
	driver.get("https://www.youtube.com/");
	
	String b=driver.getTitle();
	System.out.println(a);
	System.out.println(b);
	if(a.equals(b))
	{
		System.out.println("matching");
	}
	else
	{
		System.out.println("donot matchings");
	}
    //driver.findElement(By.tagName("input")).clear();
	//driver.findElement(By.id("a1")).clear();
	//driver.findElement(By.name("n1")).clear();
	//driver.findElement(By.className("c1")).clear();
}
}
