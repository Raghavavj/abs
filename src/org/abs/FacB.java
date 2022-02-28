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

public class FacB {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Actions a=new Actions(driver);
	Robot r= new Robot();
	driver.get("https://www.facebook.com/");	
	WebElement em = driver.findElement(By.id("email"));
	em.sendKeys("vijay");
	//a.keyDown(em,Keys.SHIFT).sendKeys("vijay").keyUp(Keys.SHIFT).perform();
	
	//a.doubleClick(em).perform();
	//a.contextClick(em).perform();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	//r.keyPress(KeyEvent.VK_DOWN);
	//r.keyRelease(KeyEvent.VK_DOWN);
	
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_X);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_X);

  r.keyPress(KeyEvent.VK_TAB);
  r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);

	}

}
