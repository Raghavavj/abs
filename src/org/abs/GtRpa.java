package org.abs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GtRpa {

	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		Actions a= new Actions(driver);
		Robot r= new Robot();
//WebElement rpa = driver.findElement(By.xpath("//a[text()='heading303']"));
//a.contextClick(rpa).perform();
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		WebElement day6 = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		a.contextClick(day6).perform();

		for (int i = 0; i <6; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
}


		r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	}

}
