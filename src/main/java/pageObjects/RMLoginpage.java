package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMLoginpage {

	WebDriver driver;
	
	public RMLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signin=By.cssSelector("[title*='Sign in']");
	By email=By.cssSelector("#useremail");
	By pwd=By.cssSelector("#userpass");
	By submit=By.cssSelector("#loginsubmit");
	By forgotpwd=By.cssSelector(".login-forgot-passwd");
	By home=By.xpath("//ul/li[1]/a");
	By trends=By.xpath("//ul/li[4]/a");
	By marketNews=By.xpath("//ul/li[5]/a");
	By investmentTool=By.xpath("//div[@id='moremoney']/ul/li[1]/a");
	By forex=By.cssSelector("[href*='/forex']");
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement pwd()
	{
		return driver.findElement(pwd);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	public RMForgotPwd forgotpwd()
	{
		driver.findElement(forgotpwd).click();
		RMForgotPwd rfp=new RMForgotPwd(driver);
		return rfp;
	}
	public WebElement home()
	{
		return driver.findElement(home);
	}
	public RMTrendspage trends()
	{
		driver.findElement(trends).click();
		RMTrendspage rt=new RMTrendspage(driver);
		return rt;
	}
	public RMMarketnewspage marketNews()
	{
		driver.findElement(marketNews).click();
		RMMarketnewspage rm= new RMMarketnewspage(driver);
		return rm;
	}
	public RMInvestmentTool investmentTool()
	{
		driver.findElement(investmentTool).click();
		RMInvestmentTool rit= new RMInvestmentTool(driver);
		return rit;
	}
	public RMForex forex()
	{
		driver.findElement(forex).click();
		RMForex rf=new RMForex(driver);
		return rf;
	}
}
