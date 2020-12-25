package com.syntax.class07;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FluentWait {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		
		driver.manage().window().fullscreen();
		
		FluentWait wait=new FluentWait();
		
		wait.withTimeOut(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
	}

	private void ignoring(Class<NoSuchElementException> class1) {
		// TODO Auto-generated method stub
		
	}

	private void pollingEvery(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

	private void withTimeOut(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}
