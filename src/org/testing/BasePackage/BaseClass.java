package org.testing.BasePackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	public Properties pr;
		
	@BeforeMethod
	public void openUrl() throws InterruptedException, IOException {
		File f=new File("../YTFrameWork/Objects.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
