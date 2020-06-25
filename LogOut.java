package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
	
	ChromeDriver driver;
	Properties pr;

	public LogOut (ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr =pr;
		
	}
	
	
	public void signOut() throws InterruptedException {
		WebElement logoutbutton = driver.findElement(By.id(pr.getProperty("logoutbutton")));
		logoutbutton.click();
		Thread.sleep(5000);

	}
}
