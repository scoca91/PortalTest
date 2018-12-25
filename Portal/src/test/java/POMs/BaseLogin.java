package POMs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseLogin {
	public WebDriver driver;
	By LoginEmail = By.id("input_email");
	By LoginPassword = By.id("input_password");
	
	
	public BaseLogin(WebDriver driver) {
		this.driver = driver;
	}

	public void  Login(String strEmail, String strPassword) {
		driver.findElement(LoginEmail).sendKeys(strEmail);
		driver.findElement(LoginPassword).sendKeys(strPassword);
	}
}
