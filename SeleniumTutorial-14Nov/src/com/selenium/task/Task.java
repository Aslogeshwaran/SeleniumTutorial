package com.selenium.task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.bookmyshow.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement cityChennai = driver.findElement(By.xpath("//span[text()='Chennai']"));
		
		cityChennai.click();
		
		WebElement searchBar = driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
		
		searchBar.click();
		
		WebElement searchBarChanged = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]"));
		
		searchBarChanged.sendKeys("The Greatest of All Time");
		
	}

}
