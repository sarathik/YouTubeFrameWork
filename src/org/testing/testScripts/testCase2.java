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

public class testCase2 extends BaseClass{
	
	@Test(priority=1)
	public void tc2() throws InterruptedException, IOException {
		LoginPage ln = new LoginPage(driver,pr);
		ln.signIn();
		
		HomePage hp = new HomePage(driver, pr);
		hp.clickOnHistory();
		
		LogoutPage lp = new LogoutPage();
		lp.logout();

	}

}
