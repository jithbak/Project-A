package com.vehi.train;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver tas = new ChromeDriver();
		tas.manage().window().maximize();
		tas.get("https://www.facebook.com/login/");
		tas.navigate().to("https://www.instagram.com/accounts/login/");
		tas.navigate().back();
		tas.navigate().forward();
		tas.navigate().refresh();
		
	}

}
