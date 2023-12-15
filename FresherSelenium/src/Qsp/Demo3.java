package Qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3
{
@Test(priority = 1)
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
