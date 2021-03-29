package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RMForgotPwd {

	WebDriver driver;
	
	public RMForgotPwd(WebDriver driver)
	{
		this.driver=driver;
	}

	By username=By.name("login");
	By plsContinue=By.cssSelector("[value*='Continue']");
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement plsContinue()
	{
		return driver.findElement(plsContinue);
	}
}