package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage {
	
	WebDriver driver;
	
	public Accountpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
@FindBy(xpath="//*[@class='breadcrumb']//a[text()='Account']")
private WebElement BreadCrumbAccount;
	

public WebElement VerifyBreadCrumbAccount()

{
	
	return BreadCrumbAccount;
}
	

}
