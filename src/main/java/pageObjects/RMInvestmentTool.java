package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMInvestmentTool {

	WebDriver driver;
	
	public RMInvestmentTool(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.cssSelector("#srchword");
	By invested=By.cssSelector("#in_money");
	By time=By.cssSelector("#selPer");
	By calculate=By.cssSelector("#btn_clc");
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement invested()
	{
		return driver.findElement(invested);
	}
	public WebElement time()
	{
		return driver.findElement(time);
	}
	public WebElement calculate()
	{
		return driver.findElement(calculate);
	}
}
