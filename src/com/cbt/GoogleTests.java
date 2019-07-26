package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		String expectedTitle = "Google";
//		String actualTitle = driver.getTitle();
//	
//		
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//			System.out.println("Expected: " + expectedTitle);
//			System.out.println("Actual: " + actualTitle);
//		}
		
//		//Get Url task 
//		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.google.com");
//		String expectedUrl = "https://www.google.com/";
//		String actualUrl = driver.getCurrentUrl();
//		if(actualUrl.contains(expectedUrl)) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//			System.out.println("Expected Url: " + expectedUrl);
//			System.out.println("Actual Url: " + actualUrl);
//		}

		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cybertekschool.com");
		String expectedUrl = "https://cybertekschool.com/";
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(expectedUrl)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected Url: " + expectedUrl);
			System.out.println("Actual Url: " + actualUrl);
		}
		driver.navigate().to("https://www.google.com");
		//Thread.sleep(1000);
		// going back the previous page
		driver.navigate().back();
		//going forward
		driver.navigate().forward();
		// Refreshing current page
		driver.navigate().refresh();
		
		driver.close();     // closes the current tab
		//driver.quit();    // closes all tabs and windows, ends the session
			
	}

}
