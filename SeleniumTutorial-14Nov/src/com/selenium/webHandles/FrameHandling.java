package com.selenium.webHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(iframe.size());
		
		System.out.println(links.size());
		
		driver.switchTo().frame("moneyiframe");
		
		WebElement nseIndex = driver.findElement(By.id("nseindex"));
		
		System.out.println(nseIndex.getText());
		
		driver.switchTo().defaultContent();
	}

}
