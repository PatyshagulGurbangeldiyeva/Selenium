package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class WebElementC {

	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String userName="Tester";
	public static String passWord="test";
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
	WebElement userNam= driver.findElement(By.xpath("//input[contains(@id,'username')]"));
	
	userNam.sendKeys(userName);
	
	Thread.sleep(1000);
	userNam.clear();
	
	userNam.sendKeys(userName);// as we deleted it we wrote it again
	
	WebElement pass=driver.findElement(By.cssSelector("input[name*='$password']"));
	pass.sendKeys(passWord);
	
	Thread.sleep(1000);//---> 1 second
	WebElement loginBtn =driver.findElement(By.cssSelector("input[value='Login']"));
	
	loginBtn.click();// it also like clicking. if there is a form to fill always use .submit()!!
	
	boolean logoIsDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
	
	
	if (logoIsDisplayed) {
		System.out.println("Logo is Displayed, Test case is passed");
	}else {
		System.out.println("Logo is not displayed, Test case is not passed");
	}
	
	
	WebElement loginInfo=driver.findElement(By.xpath("//div[@class='login_info']"));
	
	String text=loginInfo.getText();//---> you will get the text btw closed and opened >text<
	
	if (text.contains("tester")) {
		System.out.println("user has been loged in");
	}else{
		System.out.println("user has not been loged in");
	}
	
	
	
	
	}

}
