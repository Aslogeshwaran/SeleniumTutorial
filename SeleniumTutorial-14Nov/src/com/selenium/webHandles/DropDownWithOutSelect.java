package com.selenium.webHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement dropdownArrow = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div[2]/div[2]"));
		
		dropdownArrow.click();	
		
		List<WebElement> countryCodeListBox = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
		
		System.out.println(countryCodeListBox.size());
		
		//printing
		for (WebElement aa : countryCodeListBox) {
			System.out.println(aa.getText());
		}
		
		//picking 203
		for (WebElement aa : countryCodeListBox) {
			if(aa.getText().endsWith("(+91)"))
			{
				aa.click();
				break;
			}
		}
	}

}
