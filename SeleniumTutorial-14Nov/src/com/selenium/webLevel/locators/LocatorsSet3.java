package com.selenium.webLevel.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//tagname
		
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		
		List<WebElement> h2Tag = driver.findElements(By.tagName("h2"));
		
		List<WebElement> formTag = driver.findElements(By.tagName("form"));
		
		List<WebElement> ulTag = driver.findElements(By.tagName("ul"));
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		
		System.out.println(divTag.size());
		
		System.out.println(h2Tag.size());
		
		System.out.println(formTag.size());
		
		System.out.println(ulTag.size());
		
		System.out.println(aTag.size());
	}

}
