package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo4 {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "/Users/murat/workspace_selenium/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://www.qaclickacademy.com/practice.php");
			
//			driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
//			Thread.sleep(2000);
//			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN, Keys.UP);
//
//			
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			String script = "return document.getElementById(\"fromPlaceName\").value;";
//			String text = (String) js.executeScript(script);
//			for (int i = 0; i < 10; i++) {
//				while (!text.equalsIgnoreCase("BENGALURU")) {
//					driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//					Thread.sleep(2000);
//					text = (String) js.executeScript(script);
//				} 
//			}
//			System.out.println(text);

			
			driver.findElement(By.id("autocomplete")).sendKeys("TUR");
			//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String script = "return document.getElementById(\"autocomplete\").value;";
			String text = (String) js.executeScript(script);
			for (int i = 0; i < 10; i++) {
			while (!text.equalsIgnoreCase("Turkmenistan")) {
					driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
					Thread.sleep(2000);
					text = (String) js.executeScript(script);
				} 
			}
			
			System.out.println(text);
	
			
	}
}
