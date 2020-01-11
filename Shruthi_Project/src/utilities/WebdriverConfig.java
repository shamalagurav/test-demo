package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebdriverConfig {
	
	public static WebDriver getDriverInstance() 
	{
		
		String browser= DataHandlers.getDataFromProperties("config", "browser");
		String url = DataHandlers.getDataFromProperties("config","test_url");
		
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./browser-servers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "./browser-servers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else
		{
		System.err.println("-----invalid browser option"+"please check config.properties file");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
			
	}

}
