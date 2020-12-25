package com.syntax.SeleniumReview01;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework {

	public static void main(String[] args) throws InterruptedException {
//		Go to facebook.com
//		Verify “Create a new account” is Displayed
//		Fill out First name, lastname, email, new password
//		Select your birthday from given dropdowns
//		Select gender
//		Click sign up
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		WebElement creatAccount=driver.findElement(By.className("_8esh"));
		boolean createAcc=creatAccount.isDisplayed();
		System.out.println("create an account is displayed "+createAcc);
		
		if (createAcc==true) {
			
			
			driver.findElement(By.name("firstname")).sendKeys("Chloe");
			driver.findElement(By.name("lastname")).sendKeys("Ngu");
			driver.findElement(By.name("reg_email__")).sendKeys("chloe@hotmail.com");
			driver.findElement(By.xpath("//input[@type='text'][@name='reg_email_confirmation__']")).sendKeys("chloe@hotmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("abcdefg");
			
			WebElement monthDD=driver.findElement(By.name("birthday_month"));
			Select select=new Select(monthDD);
			List <WebElement> options=select.getOptions();
			
			for (WebElement option:options) {
				String textMonth=option.getText();
				if (textMonth.equalsIgnoreCase("jun")) {
					Thread.sleep(2000);
					option.click();
				}
			}
			
			WebElement dayDD=driver.findElement(By.id("day"));
			Select select2=new Select(dayDD);
			List <WebElement> options2=select2.getOptions();
			
			for (WebElement option2:options2) {
				String day=option2.getText();
				if (day.equals("2")) {
					Thread.sleep(1000);
					option2.click();
					break;
				}
			}
			
			WebElement yearDD=driver.findElement(By.id("year"));
			Select select3=new Select(yearDD);
			List <WebElement> options3=select3.getOptions();
			
			for (WebElement option3:options3) {
				String year=option3.getText();
				if (year.equals("1999")) {
					Thread.sleep(1000);
					option3.click();
					break;
				}
			}
			
			List <WebElement> radioBs=driver.findElements(By.cssSelector("input[type='radio']")); // use xpath or css every time
			String value="1";
		
			
			for (WebElement radioB:radioBs) {
				String gender=radioB.getAttribute("value");
			
				if (gender.equals(value)) {
					
					radioB.click();
					break;
				}
			}
			
			driver.findElement(By.name("websubmit")).click();
			
		}
		

	}

}
