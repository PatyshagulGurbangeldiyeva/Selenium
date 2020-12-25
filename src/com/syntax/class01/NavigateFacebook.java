package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFacebook {

	public static void main(String[] args) {
		
		// navigagte facebook
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String actualUrl=driver.getCurrentUrl(); // get the name of the page
		String expectedUrl="https://www.facebook.com/";
		
		if (actualUrl.equalsIgnoreCase("https://www.facebook.com/")) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Url is returned");
		}
		

	}

}
