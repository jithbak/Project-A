package com.sele.ct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Voilet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver Atwo = new ChromeDriver();
		Atwo.manage().window().maximize();
		Atwo.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		WebElement but = Atwo.findElement(By.xpath("//button[@class='btn btn-primary']"));
		but.click();
		
		
	}

}
