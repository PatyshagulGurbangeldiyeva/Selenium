package com.syntax.selenium.homework08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
//	Open chrome browser
//	Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//	Login to the application
//	Verify customer “Susan McLaren” is present in the table
//	Click on customer details
//	Update customers last name and credit card info
//	Verify updated customers name and credit card number is displayed in table
//	Close browser

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		String expectedName="Susan McLaren";
		List<WebElement> datas=driver.findElements(By.xpath("//table[@cellspacing='1']/tbody/tr/td"));
		
		for (int i=0; i<datas.size(); i++) {
			String datasText=datas.get(i).getText();
			
			if (datasText.equalsIgnoreCase(expectedName)) {
				System.out.println(expectedName +" is presented in the table");
				
				WebElement customerDetails=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[6]/td[13]"));
				customerDetails.click();
				
				WebElement customerFullName=driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
				customerFullName.clear();
				customerFullName.sendKeys("Susan Smith");
				
				WebElement cardButtom=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_fmwOrder_cardList']//td[3]"));
				cardButtom.click();
				
				WebElement cardNumber=driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6"));
				cardNumber.sendKeys("123445677");
				
				WebElement expDate=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
				expDate.sendKeys("05/22");
				
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
				break;
					
				}
			}
		}

	}


