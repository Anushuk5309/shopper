package regression;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1
{
	@Test(enabled = false)
	public void test1()
	{
		Reporter.log("hello",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("hii",true);
	}
}
