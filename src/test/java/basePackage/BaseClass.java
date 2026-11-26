package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagePackage.HomepageKerala;
import pagePackage.LoginKerala;

public class BaseClass {
	
	public static WebDriver driver;
	
	public LoginKerala LoginKeralaobj;
	public HomepageKerala homeobj;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver =new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		}
		
		@BeforeMethod
		public void objectmthd()
		{
			LoginKeralaobj=new LoginKerala(driver);
			homeobj=new HomepageKerala(driver);
		}


	}