package com.example;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
	
	WebDriver wd;
	@BeforeTest
	public void config() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		
	}
	
	

	@Test
	  public void test2() throws InterruptedException {
		wd.get("https://www.amazon.com/log/s?k=log+in");
		
				
	   // wd.findElement(By.linkText("Sign in")).click();
	    wd.findElement(By.id("a-autoid-1-announce")).sendKeys(Keys.ENTER);
	    
	   
	    wd.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("6379621146");
	    Thread.sleep(4000);
	   
	    wd.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	    
	    wd.findElement(By.xpath("  //*[@id=\"ap_password\"]")).sendKeys("Password0");
	    Thread.sleep(4000);
	 
	    wd.findElement(By.xpath(" //*[@id=\"auth-signin-button\"]")).click();
	    
	    
	    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Phone");
		 
		  Thread.sleep(4000);
		  wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		  
		
		  wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		  Thread.sleep(4000);
		  
		  wd.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	
	  
	  }

}
