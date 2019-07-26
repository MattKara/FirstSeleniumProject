package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
			
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	
		String actual = driver.getTitle();
		String expected = "Find a Flight";
		
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
