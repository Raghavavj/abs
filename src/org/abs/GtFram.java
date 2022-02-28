package org.abs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GtFram {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://www.greenstech.in/selenium-course-content.html");
	Actions a= new Actions(driver);
	Robot r= new Robot();
	WebElement fram = driver.findElement(By.id("heading304"));
	a.contextClick(fram).perform();
	for (int i = 0; i < 9; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
