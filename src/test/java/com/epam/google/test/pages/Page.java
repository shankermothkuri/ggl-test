package com.epam.google.test.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 

public abstract class Page {

  protected WebDriver driver;


  public Page(WebDriver driver) {
    this.driver = driver;
    this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    this.driver.manage().window().maximize();
  }

  public String getTitle() {
    return driver.getTitle();
  }
  
  public String getCurrentURL(){
	  return(driver.getCurrentUrl());
  }
  
  public void waitUntilElementVisible(WebElement element){
	 WebDriverWait wait = new WebDriverWait(driver, 10);	 
	 WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));	  
  }
  
  public void scrollToBottom(){
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,250)", "");
  }
}