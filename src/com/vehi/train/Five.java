package com.vehi.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Five {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
			WebDriver tas = new ChromeDriver();
			tas.manage().window().maximize();
			tas.get("https://infinity.icicibank.com/corp/Login.jsp");
			System.out.println(tas.getTitle());
		System.out.println(tas.getCurrentUrl());
		WebElement eml=tas.findElement(By.name("DUMMY1"));
		eml.sendKeys("dhakjdkaad");
		WebElement pasd = tas.findElement(By.id("user-id-goahead"));
		pasd.click();
		WebElement ui = tas.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		ui.sendKeys("ytututu");
		WebElement pas = tas.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pas.sendKeys("gh67se35");
		WebElement lg = tas.findElement(By.id("Action.VALIDATE_CREDENTIALS"));
		lg.click();
		//pasd.sendKeys("fjdk#788");
		//WebElement se = tas.findElement(By.name("login"));
		//se.click();

		
	}

}
