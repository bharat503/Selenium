package com.test;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PrintHtmltable {
	WebDriver driver ;
	@BeforeClass
	public void before() {
		String pagelink="https://www.amazon.in/Hipkoo-Washing-Dishwasher-Refrigerator-Capacity/dp/B0C8VB73WC/ref=lp_1380263031_1_7?pf_rd_p=9e034799-55e2-4ab2-b0d0-eb42f95b2d05&pf_rd_r=7RAGN4CCCXTGRG9AWHMY&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&th=1";
		driver=new ChromeDriver();
		driver.get(pagelink);
		timeout(20);
	}

	@Test
	public void a1() {
//		WebElement Searchbar = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//		Searchbar.sendKeys(pagelink);
//		Searchbar.sendKeys(Keys.ENTER);
//		timeout(20);
		
		
		List<WebElement> Tabledata = driver.findElements(By.id("productDetails_detailBullets_sections1"));
//		List<WebElement> TableRows=null;
		for (WebElement webElement : Tabledata) {
//			TableRows = webElement .findElements(By.tagName("tr"));
			
			
	System.out.println(webElement.getText());
		}
		
//		for (int i=0;i<TableRows.size();i++) {
//			List<WebElement> Tableheading = TableRows.get(i).findElements(By.tagName("th"));
//			List<WebElement> TableData = TableRows.get(i).findElements(By.tagName("td"));
//			System.out.print(Tableheading.get(0).getText()+"   ");
//			System.out.print(TableData.get(0).getText()+"\n");
//		}
	}
	public void timeout(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void after() {
		driver.close();
	}
}
