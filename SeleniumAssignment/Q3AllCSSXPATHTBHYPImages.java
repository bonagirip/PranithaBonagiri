package assignments2.group1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Q3AllCSSXPATHTBHYPImages {
	ChromeDriver driver;
	@Test
	public void GetXPathCSS() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkSpace\\SeleniumWorkSpace\\SDET\\drivers\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//ops.addArguments("--headless");
		ops.setHeadless(true);
		driver = new ChromeDriver(ops);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		//xpath of text boxes 
		/*
		 * User name  - //input[@id='txtUsername']
		 * password = //input[@id='txtPassword']
		 * 
		 */
		
		//CSS selectors text boxes
		/*
		 * Username - #txtUsername
		 * password = #txtPassword
		 */
		
		
		//Hyperlinks
		/*
		 * Forgot password 
		 * Xpath -  //a[contains(text(),'Forgot your password?')]
		 * CSSSelector - div:nth-child(2) form:nth-child(1) div:nth-child(9) div:nth-child(2) > a:nth-child(1)
		 * 
		 * Orange HRM Inc
		 * Xpath - //a[contains(text(),'OrangeHRM, Inc')]
		 * CSS Selector - div:nth-child(1) div:nth-child(1) div:nth-child(6) div:nth-child(1) > a:nth-child(2)
		 * 
		 * Social Networks
		 * Xpaths
		 * (//div[@id='social-icons']/a)[1]
		 * (//div[@id='social-icons']/a)[2]
		 * (//div[@id='social-icons']/a)[3]
		 * (//div[@id='social-icons']/a)[4]
		 * 
		 * CSS Selectors
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(1) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(2) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(3) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(4) > img:nth-child(1)
		 */
		
		//Images
		/*	
		 * Orange HRM
		 * Xpath
		 * (//div[@id='divLogo']/img)[1]
		 * 
		 * CSS Selector
		 * div:nth-child(1) div:nth-child(1) div:nth-child(4) div:nth-child(1) > img:nth-child(1)
		 * 
		 *Xpaths
		 * (//div[@id='social-icons']/a)[1]/img
		 * (//div[@id='social-icons']/a)[2]/img
		 * (//div[@id='social-icons']/a)[3]/img
		 * (//div[@id='social-icons']/a)[4]/img
		 * 
		 * CSS Selectors
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(1) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(2) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(3) > img:nth-child(1)
		 * div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(4) > img:nth-child(1)
		 * 
		 */
		
		
		String title = driver.getTitle();
		System.out.println("Title of page OrangeHRM is " + title);
		
	}

}