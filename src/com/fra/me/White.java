package com.fra.me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class White {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\Selinium\\\\Driver\\\\chromedriver.exe");
		WebDriver sfrm = new ChromeDriver();
		sfrm.manage().window().maximize();
		sfrm.get("https://demo.automationtesting.in/Frames.html");
		WebElement sf = sfrm.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		sf.click();
		sfrm.switchTo().frame(0);
		WebElement text = sfrm.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("hello");
		
		
		
	}

}
