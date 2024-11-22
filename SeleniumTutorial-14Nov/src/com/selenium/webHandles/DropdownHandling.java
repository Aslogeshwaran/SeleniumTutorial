package com.selenium.webHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();// named object

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/reg/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement dayDropDown = driver.findElement(By.xpath(
				"html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select[1]"));

		Select day = new Select(dayDropDown);

		day.selectByValue("13");

		WebElement monthDropDown = driver.findElement(By.xpath(
				"html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select[2]"));

		Select month = new Select(monthDropDown);

		month.selectByIndex(10);
		
		WebElement yearDropDown = driver.findElement(By.xpath(
				"html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select[3]"));

		Select year = new Select(yearDropDown);

		year.selectByVisibleText("1998");
		
		List<WebElement> allYears = year.getOptions();
		
		System.out.println(allYears.size());
		
		for (WebElement aa : allYears) {
			System.out.println(aa.getText());
		}

	}

}
