package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.RMInvestmentTool;
import pageObjects.RMLoginpage;
import resources.Base;

public class InvestmentToolTest extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void investmentTool()
	{
		RMLoginpage rl= new RMLoginpage(driver);
		RMInvestmentTool rit=rl.investmentTool();
		rit.search().sendKeys("Tata");
		List<WebElement> options=driver.findElements(By.cssSelector("[id='sugbox'] div"));
		for(WebElement option: options)
		{
				if(option.getText().equalsIgnoreCase("Tata Steel Ltd."))
				{
					option.click();
					break;
				}
		}
		rit.invested().sendKeys("200");
		Select s = new Select(rit.time());
		s.selectByVisibleText("1 month");
		rit.calculate().click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
