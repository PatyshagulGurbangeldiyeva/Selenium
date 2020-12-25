package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.Base;

public class DropDown extends Base {

	public static void main(String[] args) {
	
		setUp();
		
		List <WebElement> allDD=driver.findElements(By.tagName("a"));
		
		for (WebElement oneDD:allDD) {
			String dd=oneDD.getText();
			System.out.println(dd);
			
			if (dd.equalsIgnoreCase("List Box")) { // as on pg we have two List Boxes it is clicked to both of them
				oneDD.click();
			}
			
		}
		
		List <WebElement> listOfDD=driver.findElements(By.tagName("li"));
		
		for (WebElement oneItem:listOfDD) {
			String item=oneItem.getText();
			if(item.equals("Bootstrap List Box")) {
				oneItem.click();
				break; // we need to break the loop as we have similar text name so selenium will be confused
						// as loop got the text we don't need to loop continue
			}
			if (item.equals("Morbi leo risus")) {
				oneItem.click();
			}
		}
		
		

	}

}
