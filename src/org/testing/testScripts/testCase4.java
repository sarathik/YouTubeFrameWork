package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.BasePackage.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase4 extends BaseClass{
	
	@Test(priority=3)
	public void tc4() throws InterruptedException, IOException {
		
		LoginPage ln = new LoginPage(driver, pr);
		ln.signIn();
		
		HomePage hp = new HomePage(driver, pr);
		hp.clickOnWatch();
		
		VideoPlayPage vp = new VideoPlayPage();
		vp.clickOnLike();
		
		LogoutPage lp = new LogoutPage();
		lp.logout();

	}

}
