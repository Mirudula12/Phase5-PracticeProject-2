package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver wd;
	@BeforeTest
	public void config() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		
	}
	
	@AfterTest
	public void quitbrowser() {
		wd.quit();
	}

	
  @Test
  public void test1() throws InterruptedException {
		wd.get("https://www.amazon.in/account");
		
	    
	   
	    wd.findElement(By.id("ap_customer_name")).sendKeys("Mirudula");
	    wd.findElement(By.id("ap_phone_number")).sendKeys("6379621146");
	    wd.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mirudularavi@gmail.com");
	    wd.findElement(By.id("ap_password")).sendKeys("Password123");
		   
	  
	    Thread.sleep(8000);
	    wd.findElement(By.xpath("//*[@id=\"continue\"]")).sendKeys(Keys.ENTER);
	    
	  // wd.findElement(By.xpath("//*[@id=\"home_children_button\"]")).click();
	    
	  
	   // wd.findElement(By.xpath("//*[@id=\"image4\"]/a")).sendKeys(Keys.ENTER);
	    
	  }
}
