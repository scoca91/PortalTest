package POMs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class InitiateDriver {

	public WebDriver driver;
	
@BeforeTest
	public void  StartDriver() {
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://qa1portal.celltrust.com/");
	}
}
