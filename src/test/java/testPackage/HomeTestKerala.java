package testPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class HomeTestKerala extends BaseClass{
	
	@Test
	public void propertymthd() throws Exception
	{
		homeobj.add_property_method();
	}
}