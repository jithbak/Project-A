package com.project.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pro_Three {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		WebDriver st = new ChromeDriver();
		st.manage().window().maximize();
		st.get("http://automationpractice.com/index.php");
		WebElement si = st.findElement(By.xpath("(//a[@rel=\"nofollow\"])[1]"));
		si.click();
		WebElement email = st.findElement(By.xpath("(//input[@data-validate=\"isEmail\"])[2]"));
		email.sendKeys("krishnanb612@gmail.com");
		WebElement pass = st.findElement(By.xpath("//input[@name=\"passwd\"]"));
		pass.sendKeys("123qwe");
		Thread.sleep(4000);
		WebElement sin = st.findElement(By.xpath("//button[@id=\"SubmitLogin\"]"));
		sin.click();
		Thread.sleep(4000);
		WebElement wmn = st.findElement(By.xpath("//a[text()='Women']"));
		Actions a = new Actions(st);
		a.moveToElement(wmn).build().perform();
		Thread.sleep(2000);
		WebElement sd = st.findElement(By.xpath("(//a[@title=\"Casual Dresses\"])[1]"));
		sd.click();
		Thread.sleep(2000);
		WebElement im = st.findElement(By.xpath("//img[@title=\"Printed Dress\"]"));
		im.click();
		Thread.sleep(2000);
		st.switchTo().frame(0);
		WebElement plus = st.findElement(By.xpath("//i[@class=\"icon-plus\"]"));
		plus.click();
		Thread.sleep(2000);
		WebElement plus1 = st.findElement(By.xpath("//i[@class=\"icon-plus\"]"));
		plus1.click();
		Thread.sleep(2000);
		WebElement sz = st.findElement(By.xpath("//select[@class=\"form-control attribute_select no-print\"]"));
		Select s2 = new Select(sz);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		WebElement but = st.findElement(By.xpath("//button[@name=\"Submit\"]"));
		but.click();
		Thread.sleep(2000);
		st.switchTo().defaultContent();

		Thread.sleep(2000);
		//WebElement sheet = st.findElement(By.xpath("//div[@class=\"layer_cart_cart col-xs-12 col-md-6\"]"));
		//sheet.click();
		WebElement csh = st.findElement(By.xpath("//span[@title=\"Continue shopping\"]"));
		csh.click();
		Thread.sleep(2000);
		WebElement ad = st.findElement(By.xpath("(//a[@class=\"btn btn-default button button-small\"])[2]"));
		ad.click();

		Thread.sleep(2000);
		WebElement im2 = st.findElement(By.xpath("(//img[@class=\"replace-2x img-responsive\"])[10]"));
		im2.click();

		Thread.sleep(2000);
		WebElement plus11 = st.findElement(By.xpath("(//a[@href=\"#\"])[3]"));
		plus11.click();
		Thread.sleep(2000);
		WebElement plus111 = st.findElement(By.xpath("(//a[@href=\"#\"])[3]"));
		plus111.click();
		Thread.sleep(2000);
		WebElement size1 = st.findElement(By.xpath("//select[@name=\"group_1\"]"));
		Select s5 = new Select(size1);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		WebElement colour = st.findElement(By.xpath("//a[@title=\"Blue\"]"));
		colour.click();
		Thread.sleep(2000);
		WebElement but1 = st.findElement(By.xpath("(//button[@type=\"submit\"])[3]"));
		but1.click();
		Thread.sleep(2000);
		//WebElement sheet1 = st.findElement(By.xpath("//div[@class=\"layer_cart_cart col-xs-12 col-md-6\"]"));
		//sheet1.click();
		Thread.sleep(2000);
		WebElement proced = st.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]"));
		proced.click();
		Thread.sleep(2000);
		WebElement pcd = st.findElement(By.xpath("(//a[@title=\"Proceed to checkout\"])[2]"));
		pcd.click();
		Thread.sleep(2000);
		WebElement pcd1 = st.findElement(By.xpath("//button[@name=\"processAddress\"]"));
		pcd1.click();
		Thread.sleep(2000);
		WebElement pcd3 = st.findElement(By.xpath("//input[@name=\"cgv\"]"));
		pcd3.click();
		Thread.sleep(2000);
		WebElement pcd2 = st.findElement(By.xpath("//button[@name=\"processCarrier\"]"));
		pcd2.click();
		
	

	}

}
