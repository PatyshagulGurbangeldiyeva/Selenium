package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		// how to open / lunch the browser
		
	// 1. you need to install browsers and selenium
	// 2. then we need to create a method:
						// this chrome browsers argument       in path part we need to add for windows ".exe" at the end.( go to drivers file, choose your browaer then proporties, then select the address
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
	// 3. we need to call webDriver
		
		WebDriver driver=new ChromeDriver(); // here we are opening empty web browser
		
		driver.get("https://www.facebook.com");
		
		String url=driver.getCurrentUrl(); // this methods returns 
		
		System.out.println("Current URL is: "+url);
		
		String title=driver.getTitle();
		System.out.println("The title is "+title);
		driver.close();

	}

}
