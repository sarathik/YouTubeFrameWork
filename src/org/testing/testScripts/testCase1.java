package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.BasePackage.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Utilities.LogCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase1 extends BaseClass {
		
	@Test(priority=0)
	public void tc1() throws InterruptedException, IOException {
		LoginPage ln = new LoginPage(driver,pr);
		ln.signIn();
		ScreenshotCapture.takeScreenshot(driver, pr, "1.jpg");
		LogCapture.captureLogs("This is logger message");


		HomePage hp = new HomePage(driver,pr);
		hp.clickTrending();
		
		LogoutPage logout = new LogoutPage();
		logout.logout();
		
		 
		
	}

	
}
