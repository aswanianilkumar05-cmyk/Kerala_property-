package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginKerala {
WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbtn;
	
	public LoginKerala (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String titlemthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginmthd()
	{
		username.sendKeys("aswani.anilkumar7@gmail.com");
		password.sendKeys("123456");
		loginbtn.click();
	}
	
}


