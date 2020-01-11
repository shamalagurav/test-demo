package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DashboardScrreen {

	
	
	
	@Beforeclass()
	public void setup
	{
		
		System.setProperty("webdriver.chrome.driver", "D://java programs//work space//selenium//Jars//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/");
		//WebDriver driver=browser.setup("chrome");
		
		
	}
	
	@Test
	public void ValidatingtheHomescreen()
	{
		verify.verifyhome();
		ArrayList options=pageobject.fectchoption(pageobjet.home);
		verify.verfyopions(options)
	}
	
}
