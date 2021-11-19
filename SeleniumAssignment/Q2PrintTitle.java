package assignments2.group1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Q2PrintTitle {
	ChromeDriver driver;
	@Test
	public void PrintTitle() {
		try {		
			/*
			 * Q1OpenUrl.openurl("chrome"); ChromeDriver driver = new ChromeDriver();
			 */
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkSpace\\SeleniumWorkSpace\\SDET\\drivers\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			//ops.addArguments("--headless");
			ops.setHeadless(true);
			driver = new ChromeDriver(ops);
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println("Title of page OrangeHRM is " + title);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}

}