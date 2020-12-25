package com.syntax.selenium.homework07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
//	Windows Handling
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Javascript Alerts” link
//	Click on “Window Popup Modal” link
//	Click on the “ Follow On Instagram” button
//	Verify title of the page is “Syntax Technologies (@syntaxtechs) • Instagram photos and videos” 
//	Click on the “Like us On Facebook ” button
//	Verify title of the page is “Go to Facebook Home” 


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		

	}

}
