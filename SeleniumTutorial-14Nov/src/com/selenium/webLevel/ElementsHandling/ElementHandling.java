package com.selenium.webLevel.ElementsHandling;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement emailField=driver.findElement(By.id("email"));
		
		String tagName=emailField.getTagName();
		
		System.out.println(tagName);
		
		String idValue=emailField.getAttribute("id");
		
		System.out.println(idValue);
		
		String classValue = emailField.getAttribute("class");
		
		System.out.println(classValue);
		
		String dataTestIDvalue = emailField.getAttribute("data-testid");
		
		System.out.println(dataTestIDvalue);
		
		boolean displayed = emailField.isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = emailField.isEnabled();
		
		System.out.println(enabled);
		
		emailField.sendKeys("email@mail.com");
		
		String typedText = emailField.getAttribute("value");
		
		System.out.println(typedText);
		
		
	}

}
