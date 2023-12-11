package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	   public static void initilazation()
	   {
		   System.setProperty("WebDriver.chrome.driver","C:\\Users\\samru\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		    driver =new ChromeDriver();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.get("https://www.amazon.in/");
		    
	   }
	
}
