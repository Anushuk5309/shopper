package Qsp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class runnerscript2 extends genericscript2
{
	@Test
	public void validLogin()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
       SoftAssert sa=new SoftAssert();
        sa.assertEquals(title,"actiTIME");
        System.out.println("1");
        sa.assertAll();
	}
}
