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

public class Amaz {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Robot r= new Robot();
		Actions a= new Actions(driver);
		WebElement clk = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		clk.click();
		WebElement em = driver.findElement(By.id("ap_email"));
		em.sendKeys("raghava@gmail.com");
        a.doubleClick(em).perform();
        a.contextClick(em).perform();
             
       r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_X);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_X);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
	}

}
