package com.selenium.browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver=new ChromeDriver(options);//named object
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		 
		
	}

}
