package testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.RMForgotPwd;
import pageObjects.RMLoginpage;
import pageObjects.RMMarketnewspage;
import pageObjects.RMTrendspage;
import resources.Base;

public class LoginapplicationTest extends Base {

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void login(String username, String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		RMLoginpage rl=new RMLoginpage(driver);
		rl.signin().click();
		rl.email().sendKeys(username);
		rl.pwd().sendKeys(password);
		System.out.println(text);
		rl.submit().click();
		RMForgotPwd rfp=rl.forgotpwd();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		rfp.username().sendKeys("merwynn");
		rfp.plsContinue().click();	
		driver.switchTo().window(parentid);
		rl.home().click();
		RMTrendspage rt=rl.trends();
		rt.search().sendKeys("Tata");
		rt.getQuote().click();
		rl.home().click();
		System.out.println(driver.getTitle());		
		RMMarketnewspage rm=rl.marketNews();
		rm.showMore().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="merwyn@abc.com";
		data[0][1]="123456";
		data[0][2]="Non Restricted User";
		
		data[1][0]="sonu@abc.com";
		data[1][1]="987654";
		data[1][2]="Restricted User";
		return data;
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
