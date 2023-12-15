package Qsp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RunnerScript extends GenericScript
{
@Test
public void validLogin()
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("12345");
}
@Test
public void Forgottenpassword()
{
driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
