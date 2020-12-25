package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static String url="https://166.62.36.207/humanresources/symfony/web/index.php/dast";
	public static String userName="Admin";
	public static String passWord="Hum@nhrm123";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement userNam= driver.findElement(By.xpath("//input[contains(@id,'username')]"));
	
		userNam.sendKeys(userName);
	
		Thread.sleep(1000);
		WebElement pass=driver.findElement(By.cssSelector("input[name*='$password']"));
		pass.sendKeys(passWord);
	
		Thread.sleep(1000);//---> 1 second
		WebElement loginBtn =driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.click();// it also like clicking. 

	}

}
