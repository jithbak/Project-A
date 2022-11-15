 package com.vehi.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver dri =new ChromeDriver();
		dri.manage().window().maximize();
		dri.get("https://www.redbus.in/");
		 WebElement from = dri.findElement(By.id("src"));
		from.sendKeys("190, vinayagar koil street");
		WebElement to = dri.findElement(By.className("db"));
		to.sendKeys("234,east street");
		
		
	}

}
