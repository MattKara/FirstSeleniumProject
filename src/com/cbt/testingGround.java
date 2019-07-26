package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingGround {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		driver.findElement(By.id("usr")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body//input[3]")).click();
	}

}
