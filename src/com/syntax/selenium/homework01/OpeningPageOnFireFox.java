package com.syntax.selenium.homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningPageOnFireFox {
//	Opening Page on Firefox Browser
//	Open Firefox browser
//	Navigate to “https://www.redfin.com/”
//	Verify that you have navigated to (https://www.redfin.com/)
//	End the Session (close the browser).

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.redfin.com/");
		
		String actualUrl=driver.getCurrentUrl();
		
		String expectedUrl=("https://www.redfin.com/");
		
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Succsessfull");
		}else {
			System.out.println("Unsuccsessfull!");
		}
		Thread.sleep(2500);
		driver.close();
		
	}

}
