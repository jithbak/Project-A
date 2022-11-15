package com.vehi.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver tt = new ChromeDriver();
		tt.manage().window().maximize();
		tt.get("https://twitter.com/login");
	      System.out.println(tt.getTitle());
	   System.out.println(tt.getCurrentUrl());
	   WebElement user = tt.findElement(By.name("text"));
	   user.sendKeys("hkahakhka");
	}

}
