package com.project.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sec_pro {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver sp = new ChromeDriver();
		sp.manage().window().maximize();
		sp.get("http://automationpractice.com/index.php");
		WebElement si = sp.findElement(By.xpath("(//a[@rel=\"nofollow\"])[1]"));
		si.click();
		WebElement email = sp.findElement(By.xpath("//input[@id=\"email_create\"]"));
		email.sendKeys("krishnanb612@gmail.com");
		Thread.sleep(4000);
		WebElement ca = sp.findElement(By.xpath("//i[@class=\"icon-user left\"]"));
		ca.click();
		Thread.sleep(4000);
		WebElement mr = sp.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
		mr.click();
		Thread.sleep(4000);

		WebElement fn = sp.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		fn.sendKeys("ram");
		Thread.sleep(1000);
		WebElement ln = sp.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
		ln.sendKeys("kumar");
		Thread.sleep(2000);
		WebElement ps = sp.findElement(By.xpath("//input[@data-validate=\"isPasswd\"]"));
		ps.sendKeys("123qwe");
		Thread.sleep(1000);
		WebElement dt = ps.findElement(By.xpath("(//select[@class=\"form-control\"])[1]"));
		Select s = new Select(dt);
		s.selectByIndex(7);
		Thread.sleep(2000);
		WebElement mt = ps.findElement(By.xpath("(//select[@class=\"form-control\"])[2]"));
		Select s2 = new Select(mt);
		s2.selectByIndex(7);
		Thread.sleep(2000);
		WebElement yr = ps.findElement(By.xpath("//select[@id=\"years\"]"));
		Select s3 = new Select(yr);
		s3.selectByIndex(25);
		Thread.sleep(2000);
		WebElement co = sp.findElement(By.xpath("//input[@name=\"newsletter\"]"));
		co.click();
		Thread.sleep(2000);
		WebElement ct = sp.findElement(By.xpath("//input[@id=\"optin\"]"));
		ct.click();
		Thread.sleep(1000);
		WebElement cmp = sp.findElement(By.xpath("(//input[@class=\"form-control\"])[3]"));
		cmp.sendKeys("ABC limited");
		WebElement ado = sp.findElement(By.xpath("//input[@name=\"address1\"]"));
		ado.sendKeys("12/18,S1,vaigai street, madhanandhapuram, 600025");
		WebElement ctt = sp.findElement(By.xpath("//input[@name=\"city\"]"));
		ctt.sendKeys("madharas");
		Thread.sleep(1000);
		WebElement state = sp.findElement(By.xpath("(//select[@class=\"form-control\"])[4]"));
		Select s5 = new Select(state);
		s5.selectByIndex(8);
		Thread.sleep(1000);
		WebElement pc = sp.findElement(By.xpath("//input[@name=\"postcode\"]"));
		pc.sendKeys("60005");
		Thread.sleep(1000);
		WebElement con = sp.findElement(By.xpath("//select[@id=\"id_country\"]"));
		Select s4 = new Select(con);
		s4.selectByVisibleText("United States");
		Thread.sleep(1000);
		WebElement ai = sp.findElement(By.xpath("//textarea[@name=\"other\"]"));
		ai.sendKeys("hi welcome");
		Thread.sleep(1000);
		WebElement mp = sp.findElement(By.xpath("//input[@name=\"phone_mobile\"]"));
		mp.sendKeys("98846810");
		Thread.sleep(1000);
		WebElement aa = sp.findElement(By.xpath("//input[@name=\"alias\"]"));
		aa.sendKeys("234,nelson street");
		Thread.sleep(1000);
		WebElement  rg = sp.findElement(By.xpath("//button[@name=\"submitAccount\"]"));
		rg.click();
	}

}
