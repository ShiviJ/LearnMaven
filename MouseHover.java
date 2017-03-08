package com.org.learnMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MouseHover {
public static void main (String arg[]) throws InterruptedException{
	// Firefox Driver
	 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", false);
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	WebDriver driver = new FirefoxDriver(capabilities); 
	//Chrome Driver -- Working
	/* System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	//IE Browser -- Working 
	System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
	WebDriver driver = new InternetExplorerDriver();  */
	driver.get("http://toolsqa.wpengine.com/");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/a")));
	System.out.println("Get URL--:"+driver.getCurrentUrl());
	System.out.println(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/a")).getText());
	action.perform();
	Thread.sleep(1000);
	action.moveToElement(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/ul/li[2]/a")));
	System.out.println(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/ul/li[2]/a")).getText());
		
    action.perform();

	Thread.sleep(800);
	
	action.moveToElement(driver.findElement(By.xpath(".//*[@id='primary-menu']/li[2]/ul/li[2]/ul/li[4]/a")));
	action.click();
	action.perform();
	System.out.println("Get URL--:"+driver.getCurrentUrl());
	Thread.sleep(800);


	driver.quit();
}
}
