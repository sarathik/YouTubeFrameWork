package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	ChromeDriver driver;
	Properties pr;
	
	public HomePage(ChromeDriver dr, Properties p) {
		this.driver=dr;
		this.pr=p;		
	}
	
	public void clickTrending() {
		System.out.println("Click on Trending successful");	
	}
	
	public void clickOnHistory() {
		System.out.println("Click on History successful");	
	}
	
	public void clickOnSubs() {
		System.out.println("Click on Subscriptions successful");	
	}
		
	public void clickOnWatch() {
		System.out.println("Video is Playing");	
	}
	
	public void clickOnWatchLater() {
		System.out.println("Video is saved for watching later");	
	}
	
	public void clickOnLibrary() {
		System.out.println("Click on Watch Later is successful");	
	}
}
