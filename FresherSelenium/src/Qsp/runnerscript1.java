package Qsp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class runnerscript1 extends genericscript1
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String title = driver.getTitle();
		//System.out.println(title);
//		Assert.assertEquals(title, "actiTIME - Enter Time-Track");
//		System.out.println("1");
		Assert.assertEquals(title, "actiTIME");
		System.out.println("1");
	}

}
