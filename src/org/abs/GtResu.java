package org.abs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GtResu {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://www.greenstech.in/selenium-course-content.html");
	Actions a= new Actions(driver);
	Robot r= new Robot();
	WebElement mod = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
	mod.click();
	WebElement mod4 = driver.findElement(By.xpath("(//a[text()='Resume Model-4 '])"));
	a.contextClick(mod4).perform();
	
	for (int i = 0; i <4; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}
}
