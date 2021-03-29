package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMMarketnewspage {

	WebDriver driver;
	
	public RMMarketnewspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By showMore=By.cssSelector("[onClick*='showMore']");
	
	public WebElement showMore() 
	{
		return driver.findElement(showMore);
	}
}
