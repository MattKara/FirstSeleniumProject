package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.cybertekschool.com");
		

			
	}

}
