package com.fra.me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Black {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver ifrm = new ChromeDriver();
		ifrm.get("https://demo.automationtesting.in/Frames.html");
		WebElement sf = ifrm.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		sf.click();
		ifrm.switchTo().frame(1);
		ifrm.switchTo().frame(0);
		WebElement text = ifrm.findElement(By.xpath("//input[@type=\"text\"]"));
		text.sendKeys("hello");
		ifrm.switchTo().defaultContent();
		

	}

}
