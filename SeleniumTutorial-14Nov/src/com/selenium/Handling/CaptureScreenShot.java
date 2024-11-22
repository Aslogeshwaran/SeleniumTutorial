package com.selenium.Handling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement loginArea = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]"));
		
		File fromLoginArea = loginArea.getScreenshotAs(OutputType.FILE);
		
		File toLoginArea=new File("C:\\Users\\WELCOME234\\Desktop\\Screenshot\\loginArea"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(fromLoginArea, toLoginArea);
		
		WebElement signinButton = driver.findElement(By.className("signinbtn"));
		
		File fromSigninButton = signinButton.getScreenshotAs(OutputType.FILE);
		
		File toSigninButton=new File("C:\\Users\\WELCOME234\\Desktop\\Screenshot\\siginButton"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(fromSigninButton, toSigninButton);
		
		signinButton.click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		TakesScreenshot screen=(TakesScreenshot)driver;//step 1
		
		File from = screen.getScreenshotAs(OutputType.FILE); //step 2,3,4
		
		File to=new File("C:\\Users\\WELCOME234\\Desktop\\Screenshot\\screen"+System.currentTimeMillis()+".png");//step 5
		
		FileHandler.copy(from, to);
		
		int a=10;//int =webdriver a=driver 10=new chromedriver
		
		float b=(float)a; //float=takesscreenshot b=screen
		
		System.out.println(a);//10
		
		System.out.println(b);//10.0
		
		
				
		
	}

}
