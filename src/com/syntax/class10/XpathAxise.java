package com.syntax.class10;

public class XpathAxise {

	public static void main(String[] args) {
		
		/*
		 * USING FOLLOWING
		 * 
		 * if one element is unique , you identify the next following sibling
		 * it will give just the next element
		 *  //input[@id='calFromDate']/following-sibling::img
		 *  
		 *  if you want any following tag anf want to use index, use below example
		 *  //input[@id='avc']/following::label[3]
		 *  
		 *  
		 *  USING PROCEDING
		 *  
		 *  if you want to identify the proceeding(previous) tag by current element/tag then use "proceding::labelName"
		 *  // input[@id='edf']/proceding:: labelName [index]---> if there is more than one elements that have same labelName you can use index of the element that you want
		 *  
		 *  If you want to identify your ancestor tag from a child one use below example
		 *  //input[@id='sdd']/ancestor::labelName [index] --> if there is more than one elements that have same labelName you can use index of the element that you want 
		 *    
		 *
		 */

	}

}
