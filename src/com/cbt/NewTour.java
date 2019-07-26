package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class NewTour {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String expectedTitle = "Find a Flight";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected Url: " + expectedTitle);
			System.out.println("Actual Url: " + actualTitle);
		}

	}

}
