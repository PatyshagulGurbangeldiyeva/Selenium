package com.syntax.selenium.homework10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	
//	Upload file and Take Screenshot
//	Navigate to “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
//	Upload file
//	Verify file got successfully uploaded and take screenshot

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
	
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		

	}

}
