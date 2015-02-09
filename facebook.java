package com.learning.framwork;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Selection;

public class facebook {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Chiru");
		driver.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Pawan");
		driver.findElement(By.xpath("//*[@id='u_0_5']")).sendKeys("Ramcharan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_8']")).sendKeys("AlluArjun@gmail.com");
		driver.findElement(By.xpath("//*[@id='u_0_a']")).sendKeys("Nagababu");
		
		WebElement birthday_month = driver.findElement(By.id("month"));
		elect drop1= new Select(birthday_month);
		//dropdown1.
		 WebElement birthday_date = driver.findElement(By.id("day"));
		 Select drop2=newSelect(birthday_date);
		 
		
		
		
		
		
		
		
		//driver.findElement(By.xpath(".//*[@id='month']")).sendKeys("December");
		//driver.findElement(By.xpath("//*[@id='day']")).sendKeys("06");
		//driver.findElement(By.xpath("//*[@id='year']")).sendKeys("1987");
		//driver.findElement(By.xpath("//*[@id='u_0_g']/span[1]/label")).click();
		//driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
		
		
		
		
		
		

	}

	private static Select newSelect(WebElement birthday_date) {
		// TODO Auto-generated method stub
		return null;
	}

	
