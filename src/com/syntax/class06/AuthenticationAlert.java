package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.Constants;

public class AuthenticationAlert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();

		/* actual url is:  http://abcdatabase.com/basicauth
		 * userName=test
		 * password=test
		 */
		
		driver.get("http://test:test@abcdatabase.com/basicauth");
		
		
	}

}
