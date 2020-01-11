package pageObjectpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class Dashboard 
{
	
	WebElement element;
	WebDriver driver;
	
	
	public String title_dashboard()
	{
		String title= driver.getTitle();
		return title;
		
	}
	
	
	public WebElement home_menu()
	{
		WebElement homeMenuElement=driver.findElement(By.xpath("//ul[@id='primary-menu']/li[1]/a/span/span"));
		return homeMenuElement;
	}
	
	public WebElement tutorial_menu() 
	{
		WebElement tutorialMenuElement=driver.findElement(By.xpath("//ul[@id='primary-menu']/li[2]/a/span/span"));
		return tutorialMenuElement;
	}
	
	public WebElement demoSite_menu()
	{
		WebElement domoSiteElement=driver.findElement(By.xpath("//*[@id='primary-menu']/li[6]/a/span/span"));
		return domoSiteElement;
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////
	
	
	public List<WebElement> toFetchOptions(WebElement element)
	{
		
		
		//element.findElement(By.xpath((/../preceeing:li))
	  //driver.findElement(By.xpath)	
		List<WebElement> demo_DD=demoSite_menu().findElements(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-17611 has-children']//ul/li/a/span/span"));
		for (int i = 0; i < demo_DD.size(); i++) {
			WebElement element1 = demo_DD.get(i);
			String option=element1.getAttribute("innerHTML");
					
		}
		return demo_DD;
		
	}
	
}
