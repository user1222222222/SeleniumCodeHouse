package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	
	{
	this.driver=driver;	
	PageFactory.initElements(driver, this);
		
	}
@FindBy(id="input-email")
private WebElement emailid;

@FindBy(id="input-password")
private WebElement password;
@FindBy(css="input[value='Login']")
private WebElement Loginbutton;
	
	
	
	

	public WebElement EnterEmailid()

	{

		return emailid;
	}

	public WebElement EnterPassword()

	{

		return password;

	}

	public WebElement ClickLoginbutton()

	{

		return Loginbutton;
	}
}
