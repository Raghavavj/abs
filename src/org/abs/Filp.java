package org.abs;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filp {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\NewSelDayTwo\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
Robot r= new Robot();
Actions a= new Actions(driver);
Thread.sleep(3000);
WebElement clk = driver.findElement(By.xpath("//div[@class='_3LU4EM']"));
a.contextClick(clk).perform();

for (int i = 0; i < 4; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
}
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);






	/*Thread.sleep(3000);
	WebElement lgn = driver.findElement(By.xpath("//a[text()='Login']"));
	lgn.click();
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	name.sendKeys("Raghavan");
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A); 
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_C);
	
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);*/
}
}
