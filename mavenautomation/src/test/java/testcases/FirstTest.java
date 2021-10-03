package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	
	
	
//	@Test (priority = 0)
//	public void m1() {
//		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\CHINNU\\Downloads\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://google.com");
//		driver.manage().window().maximize();
//	}
	
//	@Test (priority = 0, enabled = false)
//
//	public void k() {
//		System.out.println("Hi Nagadivya");
//	}
//	@Test (priority = 1)
//	public void g() {
//		System.out.println("Hi Nagadivya Reddy");
//	}

	@Test(dependsOnMethods = "g" , alwaysRun = true)

	public void k() {
		System.out.println("Hi Nagadivya");
	}
	@Test (priority = 1)
	public void g() {
		System.out.println("Hi Nagadivya Reddy");
		
		Assert.assertTrue(true);
	}

}
