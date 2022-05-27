package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageClasses.LogInPage;

public class BaseClass {
	public static  WebDriver driver;
	LogInPage lip;//non static variable declaration lip
	@BeforeSuite
	public void LaunchingOfURL()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
	
	}
	@BeforeClass
	public void objectCreation()
	{
		lip=new LogInPage(driver);//initilization
		
	}

}
