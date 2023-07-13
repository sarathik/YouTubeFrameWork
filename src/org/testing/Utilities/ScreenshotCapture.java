package org.testing.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture {
	
	ChromeDriver driver;
	Properties pr;
	String tc;
	
	public ScreenshotCapture(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;		
	}
	
	public ScreenshotCapture(ChromeDriver driver, Properties pr, String tc) {
		this.driver=driver;
		this.pr=pr;		
		this.tc=tc;
	}
	
	public static void takeScreenshot(ChromeDriver driver, Properties pr, String tc) throws IOException {
	//TakesScreenshot ts = (TakesScreenshot) driver;
	File f = driver.getScreenshotAs(OutputType.FILE);
	File destFile = new File(pr.getProperty("sshotfilepath")+"_"+tc);
	FileUtils.copyFile(f, destFile);
	
	//FileHandler.copy(f, destFile);
	
	
	}

	private static TakesScreenshot TakesScreenshot(ChromeDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
