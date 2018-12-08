package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;

public class MavenGitHomework {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jorge\\OneDrive\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url="https://www.google.com/";
		driver.get(url);
		Assert.assertEquals("Google", driver.getTitle());
		
		
	}

}
