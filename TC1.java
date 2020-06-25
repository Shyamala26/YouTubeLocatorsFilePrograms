// Login +History +Logout
package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;

import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void trending() throws InterruptedException{
		WebElement email = driver.findElement(By.cssSelector(pr.getProperty("email")));
		email.sendKeys("selenium.shyamala@gmail.com");
		

		WebElement nextbutton1 = driver.findElement(By.xpath(pr.getProperty("nextbutton1")));
		nextbutton1.click();
		Thread.sleep(5000);

		WebElement password = driver.findElement(By.cssSelector(pr.getProperty("password")));
		password.sendKeys("testing@123");

		WebElement nextbutton2 = driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		nextbutton2.click();
		

		WebElement trending = driver.findElement(By.xpath(pr.getProperty("history")));
		trending.click();
		Thread.sleep(3000);

		WebElement logoutbutton = driver.findElement(By.id(pr.getProperty("logoutbutton")));
		logoutbutton.click();
		Thread.sleep(5000);
		
	}

}
