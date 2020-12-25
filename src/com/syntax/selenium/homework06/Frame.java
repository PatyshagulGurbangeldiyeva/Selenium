package com.syntax.selenium.homework06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
//	Syntax Frame verification
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Others” link
//	Click on “Iframe” link
//	Click on the “Home” link inside the first frame
//	Verify “Syntax logo” is displayed in second frame
//	Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.manage().window().fullscreen();
		
		List <WebElement> links=driver.findElements(By.xpath("//li[@class='dropdown']"));

		for (WebElement link:links) {
			String linkText=link.getText();
//			System.out.println(linkText);
			if (linkText.equals("Others")) {
				Thread.sleep(2000);
				link.click();
				break;
			}
		}
		Thread.sleep(1000);
		
		List<WebElement> DD=driver.findElements(By.tagName("a"));
		for (WebElement dd:DD) {
			String ddText=dd.getText();
	//		System.out.println(ddText);
			if (ddText.equals("Iframe")) {
				dd.click();
				break;
			}
		}
		
		
		
		WebElement homeFrame=driver.findElement(By.name("FrameOne")); 
		driver.switchTo().frame(homeFrame);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Home")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		boolean logo=driver.findElement(By.className("custom-logo")).isDisplayed();
		
		if (logo) {
			System.out.println("is logo displayed: "+logo);
		}
		driver.quit();
		
	}

}
