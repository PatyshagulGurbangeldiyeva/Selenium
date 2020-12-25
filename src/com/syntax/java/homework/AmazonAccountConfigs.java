package com.syntax.java.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAccountConfigs {

	public static void main(String[] args) throws IOException {
		
//		Store configuration in property file to create an Amazon account:
//			browser
//			url
//			name
//			email
//			password
		
		// 1. need to have filePath
		String filePath=System.getProperty("user.dir")+"/configs/AmazonAccount";
 	System.out.println(filePath);
		
		//2.need to have FIS
		FileInputStream fis=new FileInputStream(filePath);
		
		//3. as we opened configs we need to load the info in class Properties();
		Properties prop=new Properties();
		prop.load(fis);
		
		
		// 4.as we load the info we can go to webDriver
		
		String browser=prop.getProperty("browser");
		
		WebDriver driver=null;
		
		switch (browser){
		case "chrome":
		System.setProperty("webdriver.chrome.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/chromedriver" );
		driver=new ChromeDriver();
		break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver","/Users/vepagurbangeldiyev/eclipse-workspace/Selenium/drivers/geckodriver");
			driver=new FirefoxDriver();	
			break;
			
		}
		
		String url=prop.getProperty("url");
		driver.get(url);
		
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(prop.getProperty("name"));
			
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.id("ap_password_check")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.id("continue")).click();
		
		driver.quit();
		
		

	}

}
