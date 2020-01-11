package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class utilities {
	
	
	WebDriver driver;

	public void mouseover(WebElement element)
	{
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}

	
	
}
