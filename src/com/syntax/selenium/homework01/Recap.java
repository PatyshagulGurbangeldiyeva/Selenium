package com.syntax.selenium.homework01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Recap {
//	 static WebDriver driver; // if our variable is instance we need to create an obj or make the variable static

	public static void main(String[] args) throws IOException, InterruptedException {
		
//	CREATE A PROPERTY FILE TO STORE following configurations:
//		browser=
//		url=
//		username=
//		password=
//
//		In your Selenum code use values from properties file to open specified browser, navigate to specified url and enter username and password
	

		
		String filePath=System.getProperty("user.dir")+"/configs/Recap.properties";
		// short way
		// why we are doing it? when we will work we will work with 3-4 testers. so everybody can store their
		// configs in another place so we are getting (user.dir) then attached our files name
		
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
	
		WebDriver driver=null;// if you don't put it in instance variable you must to initialize it!!!!
		
		switch (browser.toLowerCase()) {
		
		case "chrome":
		System.setProperty("webdriver.chrome.driver", "/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/chromedriver");
		 driver=new ChromeDriver();
		break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/geckodriver");
			driver=new FirefoxDriver();
			break;
		
		}
		
		driver.get(prop.getProperty("url"));
		driver.get(prop.getProperty("username"));
		driver.get(prop.getProperty("password"));
		Thread.sleep(3000);// --> waiting 3 seconds
		
		driver.findElement(By.id("email"));
		driver.close();	
		
		
}
}



