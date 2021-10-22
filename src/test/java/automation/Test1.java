package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void myMethod1()
	{
		System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://google.com");
		
	}
	
	
}
