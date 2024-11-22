package com.selenium.webHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/reg/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement maleRadioButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label/input"));
		
		boolean displayed = maleRadioButton.isDisplayed();
		
		boolean enabled = maleRadioButton.isEnabled();
		
		boolean beforeClickSelected = maleRadioButton.isSelected();
		
		System.out.println(displayed);//true
		
		System.out.println(enabled);//true
		
		System.out.println(beforeClickSelected);//false
		
		maleRadioButton.click();
		
		boolean afterClickSelected = maleRadioButton.isSelected();
		
		System.out.println(afterClickSelected);//true
		
		
	}

}
