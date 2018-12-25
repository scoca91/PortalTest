package Tests;

import org.testng.annotations.Test;
import POMs.InitiateDriver;
import POMs.BaseLogin;

public class LoginTest extends InitiateDriver  {
	
	@Test
	public void LoginUser() {
		BaseLogin forLogin  = new BaseLogin(driver);
		forLogin.Login("xxxxx","xxxx");
	}
}
