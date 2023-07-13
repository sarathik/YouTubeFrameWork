package org.testing.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.BasePackage.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase8 extends BaseClass{
	
	@Test(priority=7)
	public void tc8() throws InterruptedException, IOException {
		LoginPage ln = new LoginPage(driver, pr);
		ln.signIn();
		
		HomePage hp = new HomePage(driver, pr);
		hp.clickOnLibrary();
		
		LogoutPage lp = new LogoutPage();
		lp.logout();

	}

}
