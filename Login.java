package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver;
	Properties pr;
	
	
	public Login (ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr =pr;
		
	}
	
	public void signIn(String userName ,  String passWord)
	{
		WebElement user =driver.findElement(By.id(pr.getProperty("user")));
		user.sendKeys(userName);
		
		WebElement password =driver.findElement(By.id(pr.getProperty("password")));
		password.sendKeys(passWord);
	}

}
