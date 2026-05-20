package com.demo;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
	public static void main(String[] args) throws InterruptedException, Exception {

	        WebDriver driver;
	        driver = new ChromeDriver();
	       
	        
	        driver.get("https://www.saucedemo.com/");

	        driver.manage().window().maximize();

	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");

	        Thread.sleep(2000);

	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_sauce");
	        
	        Thread.sleep(2000);
	        
	        //Screen shot 
	        File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(ss, new File("Screenshots/login.png"));
			
	        WebElement loginBtn = driver.findElement(By.id("login-button"));
	        loginBtn.click();

	        Thread.sleep(3000);
	        
		    WebElement PSelect = driver.findElement(By.xpath("//option[@value='lohi']"));
		    PSelect.click();
	         
		    Thread.sleep(3000);	
		    
	        		
	        WebElement add1 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
	        
	        add1.click();
	        
	        
	        WebElement add2 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

	        //scrolling down 
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", add2);
	        Thread.sleep(3000);

	        add2.click();
	        Thread.sleep(5000);
	        
	        
	        WebElement cart = driver.findElement(By.xpath ("//*[@id=\"shopping_cart_container\"]/a"));
	        //scrolling up
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("arguments[0].scrollIntoView(true);", cart);
	        Thread.sleep(3000);
	        
	        cart.click();

	        Thread.sleep(5000);
	        
	        
	        WebElement check = driver.findElement(By.id("checkout"));
	        check.click();

	        Thread.sleep(5000);

	        
	        WebElement name = driver.findElement(By.id("first-name"));
	        name.sendKeys("Priyanka");
	        
	        WebElement lastname = driver.findElement(By.id("last-name"));
	        lastname.sendKeys("S N"); 

	        Thread.sleep(5000);
	        
	        
	        WebElement code = driver.findElement(By.id("postal-code"));
	        code.sendKeys("2345"); 

	        Thread.sleep(5000);
	       
	        WebElement continues= driver.findElement(By.id("continue"));
	        continues.click();

	        Thread.sleep(5000); 
	        
	        WebElement buttonC= driver.findElement(By.id("finish"));
	        buttonC.click();
	        
	        File ss1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(ss1, new File("Screenshots/checkout.png"));

	        Thread.sleep(5000); 
	        
	        System.out.println("hi priya successfully completed ur order, tq for ordering");
	        
	        driver.close();
	    }
}


