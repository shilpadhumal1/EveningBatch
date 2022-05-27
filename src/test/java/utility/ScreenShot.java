package utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static  void screenShot(WebDriver driver,String screenShotName) throws Exception
	{
		TakesScreenshot tksr = (TakesScreenshot)driver;
		File source = tksr.getScreenshotAs(OutputType.FILE);
		File target=new File("F:\\ClassNotes\\sreenshot\\"+screenShotName+".png");
		FileHandler.copy(source, target);
		
	}

}
