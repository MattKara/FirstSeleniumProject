package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com");
//		String expected = "Google new";
//		String actual = driver.getTitle();
//		System.out.println(actual);
//		if(expected.equals(actual)) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//			System.out.println("Expected: " + expected);
//			System.out.println("Actual: " + actual);
//		}
//		
//		driver.close();
		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://cybertekschools.com");
		driver.navigate().to("https://cybertekschools.com");
		String expected = "https://cybertekschools.com/";
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected: " + expected);
			System.out.println("Actual: " + actual);
		}
		
		driver.close();
	}
}
