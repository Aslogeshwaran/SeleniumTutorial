package com.selenium.webLevel.ElementsHandling;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement links=driver.findElement(By.partialLinkText("?"));
		
		String tagName=links.getTagName();
		
		System.out.println(tagName);
		
		String hrefValue=links.getAttribute("href");
		
		System.out.println(hrefValue);
		
		String text = links.getText();
		
		System.out.println(text);
		
		boolean displayed = links.isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = links.isEnabled();
		
		System.out.println(enabled);
		
		List<WebElement> linksElements = driver.findElements(By.tagName("a"));
		
		System.out.println(linksElements.size());
		
		for(WebElement aa:linksElements)
		{
			System.out.println(aa.getText()+" =======> "+aa.getAttribute("href"));
		}
		
		
	}

}
