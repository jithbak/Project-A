package com.fra.me;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indigo {
        public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
			WebDriver pmt = new ChromeDriver();
			pmt.manage().window().maximize();
			pmt.get("https://demo.automationtesting.in/Alerts.html");
			System.out.println(pmt.getTitle());
			WebElement st = pmt.findElement(By.xpath("(//a[@class='analystic'])[3]"));
			st.click();
			WebElement bt = pmt.findElement(By.xpath("//button[@onclick='promptbox()']"));
			bt.click();
			Thread.sleep(5000);
			Alert pa = pmt.switchTo().alert();
			pa.sendKeys("welcome");
			pa.accept();
			
			
		}
}
