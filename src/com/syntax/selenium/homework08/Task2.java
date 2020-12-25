package com.syntax.selenium.homework08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
//	Delete Employee
//	Open chrome browser
//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//	Login into the application
//	Add Employee
//	Verify Employee has been added
//	Go to Employee List
//	Delete added Employee
//	Quit the browser

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		String firstName="Ashley";
		String lastName="Aaaa";
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		driver.findElement(By.name(lastName)).sendKeys("Aaaa");
		
		String empID=driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		
		String empDitails=driver.findElement(By.id("profile-pic")).getText();
		
		driver.findElement(By.id("btnSave")).click();
		
		if (empDitails.equals(firstName+" "+lastName)) {
			System.out.println("employee was successfully added");
		}else {
			System.err.println("employee was not added");
		}

		
		// navigate to employee
		driver.findElement(By.linkText("Employee List")).click();
		
		
		//define flag variable
		boolean found=false;
		
		while (!found) {//  till it found keep clicking next!!!
			
			List<WebElement> rows=driver.findElements(By.xpath("table[@id='resultTable']//tr"));
			
			for (int i=1; i<rows.size(); i++) {
				String rowText=rows.get(i-1).getText();
				if (rowText.contains(empID)) {
					found=true;
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]")).click();
					Thread.sleep(4000);
					driver.findElement(By.id("btnDelete")).click();
					Thread.sleep(5000);
				
					// the popUp will come
					driver.findElement(By.id("dialogDeletBtn")).click();
					break;
				}
			}
			
			
			
		}
	}

}
