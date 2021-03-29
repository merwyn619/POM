package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RMTrendspage {

	WebDriver driver;
	
	public RMTrendspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By search=By.cssSelector("#srchword");
	By getQuote=By.cssSelector("[class*='btn_srch']");*/
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(css="[class*='btn_srch']")
	WebElement getQuote;
	
	public WebElement search()
	{
		return search;
	}
	public WebElement getQuote()
	{
		return getQuote;
	}
}
