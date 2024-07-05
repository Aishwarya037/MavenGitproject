package org.browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Test1");
	System.out.println("Test2");
	WebElement txtUser = driver.findElement(By.name("email"));
	txtUser.sendKeys("Revathi");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("12345");
	WebElement btn = driver.findElement(By.name("login"));
	btn.click();
	System.out.println("Rammohan");
}
}
