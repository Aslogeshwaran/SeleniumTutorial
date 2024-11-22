package com.selenium.Handling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.makemytrip.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.ticketnew.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.axisbank.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.zomato.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
				
		Set<String> windows = driver.getWindowHandles();
		
		ArrayList<String> list=new ArrayList<String>(windows);
		
		System.out.println(list.size());//6
		
		driver.switchTo().window(list.get(3));
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	}

}
