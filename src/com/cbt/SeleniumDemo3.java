package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		

		
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		String actual = driver.getTitle();
		String expected = "Gmail";
		
		System.out.println(actual);
		if(actual.contains(expected)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		// goes back to previous page
		driver.navigate().back();
		
		actual = driver.getTitle();
		expected = "Google";
		
		System.out.println(actual);
		if(actual.contains(expected)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		// goes forward to page where back button was clicked
		driver.navigate().forward();
		actual = driver.getTitle();
		expected = "Gmail";
		
		System.out.println(actual);
		if(actual.contains(expected)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		
		driver.close();
	}
}
