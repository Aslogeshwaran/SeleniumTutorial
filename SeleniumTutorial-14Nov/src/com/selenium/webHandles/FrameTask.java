package com.selenium.webHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		List<WebElement> iframe = driver.findElements(By.tagName("frame"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(iframe.size());
		
		System.out.println(links.size());
		
		driver.switchTo().frame(0);
		
		WebElement textBoxFrame1 = driver.findElement(By.name("mytext1"));
		
		textBoxFrame1.sendKeys("Hi");
		
		driver.switchTo().defaultContent();
		
		WebElement frameCenter = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		
		driver.switchTo().frame(frameCenter);
		
		WebElement textBoxFrame3 = driver.findElement(By.name("mytext3"));
		
		textBoxFrame3.sendKeys("Hello");
		
//		driver.switchTo().frame("moneyiframe");
//		
//		WebElement nseIndex = driver.findElement(By.id("nseindex"));
//		
//		System.out.println(nseIndex.getText());
//		
		driver.switchTo().defaultContent();
	}

}
