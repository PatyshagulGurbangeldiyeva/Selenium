package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	static WebDriver driver;
	public static void browser (String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/chromedriver");	
			driver=new ChromeDriver();
		}else if (browser.equals("firefox")){
			System.setProperty("webdriver.geckodriver.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/geckodriver");
			driver=new ChromeDriver();
	}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
//		CREATE A PROPERTY FILE TO STORE following configurations:
//			browser=
//			url=
//			username=
//			password=
//
//			In your Selenum code use values from properties file to open specified browser, navigate to specified url and enter username and password
		
		
		String filePath="/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/configs/task1.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		String browser=prop.getProperty("browser");
		browser(browser.toLowerCase());		
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
	
		
		
		
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_b")).click();
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.quit();
	}

}
