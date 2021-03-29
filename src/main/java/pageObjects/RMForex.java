package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMForex {

	public WebDriver driver;
	
	public RMForex(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By amount=By.cssSelector("#amt");
	By from=By.cssSelector("#cnfrm");
	By to=By.cssSelector("#cnto");
	By convert=By.cssSelector(".button");
	By result=By.cssSelector("#resdiv");
	
	public WebElement amount()
	{
		return driver.findElement(amount);
	}
	public WebElement from()
	{
		return driver.findElement(from);
	}
	public WebElement to()
	{
		return driver.findElement(to);
	}
	public WebElement convert()
	{
		return driver.findElement(convert);
	}
	public WebElement result()
	{
		return driver.findElement(result);
	}
}
