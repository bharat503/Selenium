package com.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class WebTest {
	
	@Test	
	public void a() throws InterruptedException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement m = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		m.sendKeys("Narendra modi");
		this.snapshot(driver,"C:\\Users\\BHARAT\\eclipse-workspace\\Selenium\\Resources\\Screen.png");
		m.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		List<WebElement> webelement = driver.findElements(By.className("GTRloc"));
		
//		for(int i=0;i<webelement.size();i++) {
//			System.out.println( webelement.get(i).getText());
//		}
		
		for (WebElement webElement2 : webelement) {
			System.out.println(webElement2.getText());
		}
		
	}

	private void snapshot(WebDriver driver, String string) throws IOException {
		TakesScreenshot scr=((TakesScreenshot)driver); // Driver object to screen shot
		File srcfile=scr.getScreenshotAs(OutputType.FILE); // call getscreen for creating image
		File DestFile=new File(string); // Move image file to new destination
		FileUtils.copyFile(srcfile, DestFile);
		
		
	}

}
