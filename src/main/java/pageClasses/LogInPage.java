package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	//we have to declare our data(WebElements) as private
	//We have to initialize our webElement by using constructor 
	//We can utilize this data(Web element  )in to public methods getter and setter method
	//encapsulation principle is used to design page classes
	
		@FindBy(xpath="//input[@type='text']")
		private WebElement userIddd;
		@FindBy(xpath="//input[@type='password']")
		private WebElement passWord;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement LogInButton;
		@FindBy(xpath="//input[@type='password']")
		private WebElement pin;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement continueButton;
		@FindBy(xpath="//span[text()='Shilpa']")
		private WebElement afterLoginTexttt;
		public LogInPage(WebDriver driver)
		
		
		{
			
			PageFactory.initElements(driver,this);//all global non static elements are initilized by usingpage factory class
			//this refers all global variables
		}
		public boolean userID(String userid)
		{
			userIddd.sendKeys(userid);
			return userIddd.isDisplayed();
		}
		public void password(String password)
		{
			passWord.sendKeys(password);
		}
		public boolean login()
		{
			LogInButton.click();
			return LogInButton.isEnabled();
		}
		public void pin1(String pin1) throws Exception
		{
			Thread.sleep(3000);
			pin.sendKeys(pin1);
		}
		public void continueButton()
		{
			continueButton.click();
			
		}
		public String verifyLogInisSuccessful()
		{
			String text = afterLoginTexttt.getText();
			return text;
		}
	
		
		
		
	
	
	
	
	

}
