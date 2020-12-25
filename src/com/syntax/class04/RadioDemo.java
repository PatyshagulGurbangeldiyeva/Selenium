package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url="https://demoqa.com/automation-practice-form/";
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		// 1.we need to find that element then we can work on it
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		
		//2. we need to find is it present,enabled and selected
		System.out.println(maleRadioB.isDisplayed()); //true---> 
		System.out.println(maleRadioB.isEnabled()); //true--->before you click you need to write smt then you can click so it means enable
		System.out.println(maleRadioB.isSelected());// false--> as we did not select it
		
		
		System.out.println("****************");
		
		//first way to click on radi0 button
		maleRadioB.click();//----> here we click (selected the radio botton
		System.out.println("Radio botton is selected: "+maleRadioB.isSelected());//---> and here we checked it is it selected or not (it will give boolean botton)
		

		//second way to click the radio botton
		List<WebElement>prolist=driver.findElements(By.xpath(("//input[@name='profession']")));//--> here we are working with groups more than one element
																// as there are more than one element it will give List
		
		int listSize=prolist.size();
		System.out.println("Size of checkBoxes is: "+listSize);
		
		// if you want to use short cut foreach+cntr+shift
		
		
		System.out.println("**************");
		
		String valueToBeSelected="Manual Tester";
		
		// here we are getting elements from prolist:
		for (WebElement profession : prolist) {
			
			if (profession.isEnabled()) {//--> checking if the checkBox enabled or not
				
				String value=profession.getAttribute("value");//--> here we get the values of ===//input[@name='profession']
				
				System.out.println(value);	
				
				if (value.equals(valueToBeSelected));//--> we declared it before in order to not have hard codding
				
				profession.click();//--> if the value equals to "manual tester" we are clicking it
				
				break;//--> then we are breaking the loop and because of that the second value SOS(value) did not printed
				
			}
			
		}
		
	}
}
