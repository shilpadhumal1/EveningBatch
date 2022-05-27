package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	@FindBy(xpath="//button[text()='Start investing ']")
	private WebElement startInvesting;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void startInvest()
	{
		startInvesting.click();
	}

}
