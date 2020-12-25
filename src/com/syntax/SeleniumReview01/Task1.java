package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.Base;

public class Task1 extends Base{
//	Go to amazon.com
//	 * select books from the search dropdown
//	 * type Harry potter
//	 * and click on Search
//	 * check Unofficial CookBook checkbox on the left under Book Series

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
	WebElement searchDD=driver.findElement(By.id("searchDropdownBox"));
	
	Select select =new Select(searchDD);
	
	List <WebElement> options=select.getOptions();
	
	for (WebElement option:options) {
		String optionText=option.getText();
		
		if (optionText.equals("Books")) {
			option.click();
		}
	}
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
	driver.findElement(By.className("nav-input")).click();
	
	List <WebElement> bookSeriesCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
	for(WebElement bookSeriesCheckBox: bookSeriesCheckBoxes) {
		String textOfCheckBox=bookSeriesCheckBox.getText();
		
		if ( !bookSeriesCheckBox.isSelected() && textOfCheckBox.equalsIgnoreCase("Unofficial Cookbook") ) {
			Thread.sleep(1000);
			bookSeriesCheckBox.click();
			break;
		}
	}
	
	
	
	
	
	}

}
