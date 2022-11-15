package com.sele.ct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver sel = new ChromeDriver();
		sel.get("https://www.facebook.com/");
		System.out.println(sel.getCurrentUrl());
		System.out.println(sel.getTitle());
		
		WebElement cl = sel.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		cl.click();
		Thread.sleep(5000);
		
		
		WebElement day = sel.findElement(By.id("day"));
		Select s = new Select (day);
		s.selectByIndex(27);
		WebElement month = sel.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select (month);
		s1.selectByVisibleText("Jun");
		WebElement year = sel.findElement(By.xpath("//select[@aria-label='Year']"));
		 
		Select s2 = new Select (year);
		s2.selectByIndex(10);
		WebElement gender = sel.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
		gender.click();
		
	}

}
