package com.vehi.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe" );
		WebDriver whl = new ChromeDriver();
		whl.manage().window().maximize();
		whl.get("https://www.google.com/");
		System.out.println(whl.getTitle());
		System.out.println(whl.getCurrentUrl());
		WebElement go = whl.findElement(By.name("q"));
		go.sendKeys("GreensTechnology");
		
		
		
		
		
	}

}
