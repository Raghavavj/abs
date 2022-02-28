package org.abs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Abstract\\Driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
Thread.sleep(3000);
driver.findElement(By.id("signin-block")).click();
driver.findElement(By.xpath("//div[@id='hc']")).click();
Thread.sleep(3000);
WebElement frm = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
driver.switchTo().frame(frm);


driver.findElement(By.id("mobileNoInp")).sendKeys("836767456");
}
}
