package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlayPage {

	ChromeDriver driver;
	Properties pr;

	public void clickOnLike() {
		System.out.println("Click on Video and Like is successful");
	}

	public void clickOnChannel() {
		System.out.println("Click on Video and Channel Subscription is successful");
	}

	public void commentOnVideo() {
		System.out.println("Comment on Video is successful");
	}

}
