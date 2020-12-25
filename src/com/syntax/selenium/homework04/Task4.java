package com.syntax.selenium.homework04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	
//	 Radio Buttons Practice  
//	 Open chrome browser
//	 Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	 Click on “Input Forms” links
//	 Click on “Radio Buttons Demo” links
//	 Click on any radio button in “Radio Button Demo” section.
//	 Verify correct radio is clicked
//	 Click on any radio button in “Group Radio Buttons Demo” section.
//	 Verify correct checkbox is clicked
//	 Quit browser

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']")).click();
		
		Thread.sleep(1000);
		WebElement femaleRadioB=driver.findElement(By.xpath("//input[@value='Female'][@name='optradio']"));
		femaleRadioB.click();
		
		Thread.sleep(1000);
//		System.out.println(femaleRadioB.isDisplayed());
//		System.out.println(femaleRadioB.isEnabled());
		System.out.println(femaleRadioB.isSelected());
		
		String demandedAge="0 - 5";
		String demandedSex="Male";
		List <WebElement>radioBottoms=driver.findElements(By.tagName("input"));
		
		System.out.println(radioBottoms.size());
		
		
		for (WebElement rb:radioBottoms) {
			if (rb.getAttribute("value").equals(demandedAge) && rb.getAttribute("value").equals(demandedSex)) { // here you can change and to or
				System.out.println("demanded age or sex was selected, test passed");
			
			}else {
				System.out.println("test failed");
			}
			break;
		}
		
		
//		driver.close();
	}

}
