package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Contact");
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// here we are asking to wait for 5 secnods in order to do next action finding xpath
																	// it is only used with findElement() or findElements() methods
																	// we just need to write it once it will work the whole pg where we used findElement/findElements
		
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		String text=driver.findElement(By.className("ContactUs")).getText();// if i will give 5 seconds for waiting then the text will not be executed as it is not uploaded and selenium has already checked 
		
		System.out.println(text);

	}

}



