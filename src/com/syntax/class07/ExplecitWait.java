package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplecitWait {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("save")).click(); // clicking to the button "Get New User"
//		boolean firstName=driver.findElement(By.xpath("//p[contains(text(),'First Name :')]")).isDisplayed();// here we want to see do we have "first name" it is stable

		
		//		here we had exception so then we will use explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'First N') ]")));
		boolean isDisplayed=driver.findElement(By.xpath("//p[contains(text(), 'First N') ]")).isDisplayed();
		System.out.println("First name is displayed?"+isDisplayed);;

}
}
