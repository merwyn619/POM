package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.RMForex;
import pageObjects.RMLoginpage;
import resources.Base;

public class ForexTest extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void forex()
	{
		RMLoginpage rl=new RMLoginpage(driver);
		RMForex rf=rl.forex();
		rf.amount().clear();
		rf.amount().sendKeys("2000");
		Select s=new Select(rf.from());
		s.selectByVisibleText("Euro");
		Select s2=new Select(rf.to());
		s2.selectByVisibleText("Indian Rupees");
		rf.convert().click();
		System.out.println(rf.result().getText());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
