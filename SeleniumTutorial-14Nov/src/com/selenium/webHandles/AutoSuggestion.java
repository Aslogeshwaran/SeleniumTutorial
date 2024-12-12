package com.selenium.webHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("isro");
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));
		
		System.out.println(suggestionList.size());
		
		for(WebElement aa:suggestionList)
		{
			System.out.println(aa.getText());
		}
		
		for(WebElement aa:suggestionList)
		{
			if(aa.getText().endsWith("recruitment 2024"))
			{
				aa.click();
				break;
			}
		}
		
		
	}

}
