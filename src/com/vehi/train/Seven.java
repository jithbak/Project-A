package com.vehi.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver hd = new ChromeDriver();
		hd.manage().window().maximize();
		hd.get("https://netbanking.hdfcbank.com/");
		System.out.println(hd.getTitle());
		System.out.println(hd.getCurrentUrl());
		WebElement ui = hd.findElement(By.name("//input[@name='fldLoginUserId']"));
		ui.sendKeys("gjhhjgj");
	}

}
