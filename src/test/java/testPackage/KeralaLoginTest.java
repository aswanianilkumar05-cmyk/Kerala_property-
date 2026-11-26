package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;

public class KeralaLoginTest extends BaseClass{
		
	@Test(priority=1)
	public void titleverification_mthd()
	{
		LoginKeralaobj.titlemthd();
		String actualTitle =LoginKeralaobj.titlemthd();
		Assert.assertEquals(actualTitle, "Post your Property - Login | Keralaproperty");	}
	
	@Test(priority=2)
	public void loginverification_mthd()
	{
		LoginKeralaobj.loginmthd();
	}

}