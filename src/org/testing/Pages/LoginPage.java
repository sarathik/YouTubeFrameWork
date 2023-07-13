package org.testing.Pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Utilities.ScreenshotCapture;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;		
	}
	
	public void signIn() throws InterruptedException, IOException {
		
		WebElement signBtn = driver.findElement(By.xpath(pr.getProperty("eleSignBtn")));
		signBtn.click();
		
		WebElement userName = driver.findElement(By.xpath(pr.getProperty("eleUserName")));
		userName.sendKeys(pr.getProperty("username"));
		
		WebElement nextBtn = driver.findElement(By.xpath(pr.getProperty("elenextBtn")));
		nextBtn.click();

		Thread.sleep(5000);
		
//		WebElement psswdField = driver.findElement(By.xpath(pr.getProperty("elepsswdField")));
//		psswdField.sendKeys(pr.getProperty("password"));
//		Thread.sleep(2000);
//		
//		WebElement passNxtBtn = driver.findElement(By.xpath(pr.getProperty("elepassNxtBtn")));
//		passNxtBtn.click();
//		Thread.sleep(10000);
		
		System.out.println("Login successful");
	}
	
	
	
	

}
