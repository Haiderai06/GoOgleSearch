package com.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Project Done by Suhail Abbas 

public class GoogleSearchPage {
	WebDriver driver;
	String url = "https://www.google.com/";

	@BeforeTest
	public void launchApplication	() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Window is maximised.");
		driver.get(url);
		//Code is added by suhail
		System.out.println("Google search page is opened.");
	}

	@Test
	public void search() {
		WebElement searchInput = driver.findElement(By.xpath("//input[@title='Search']"));
		searchInput.sendKeys("Telus International");
		System.out.println("Input is entered.");
		WebElement searchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		searchBtn.click();
		System.out.println("Search button is clicked.");
		//added by Suhail.
		System.out.println("Search result is displayed.");
	}

	@AfterTest
	public void closeApplication() {
		driver.close();
		System.out.println("Application is closed.");
	}
}
