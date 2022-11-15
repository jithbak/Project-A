package com.sele.ct;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyBlue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://demo.automationtesting.in/Alerts.html");

		WebElement sel = drv.findElement(By.xpath("//*[@onclick='alertbox()']"));
		sel.click();
		Thread.sleep(5000);
		 Alert salert = drv.switchTo().alert();
		 salert.accept();

	}
}
