package org.abs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Goo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Robot r=new Robot();
		Actions a= new Actions(driver);
		driver.get("https://www.google.co.in/");
		WebElement ent = driver.findElement(By.name("q"));
		ent.sendKeys("Vel Murugan");
		a.doubleClick(ent).perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		

		

	}

}
