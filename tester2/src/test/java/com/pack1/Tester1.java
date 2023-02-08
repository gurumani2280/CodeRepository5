package com.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		String driverPath="C:\\Users\\tester_android\\Desktop\\MorningBatch01\\javaWorkspace\\browser-exe\\windows\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.name("state"));
		Select dd = new Select(ele);
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByValue("1");
		Thread.sleep(2000);
		dd.selectByVisibleText("TELENGANA");
		System.out.println(dd.isMultiple());
		Thread.sleep(1000);
		List<WebElement> i  = dd.getOptions();
		for( WebElement el: i)
		{
			System.out.println(el.getText());
		}
		driver.quit();
	

	}

}
