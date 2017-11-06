package com.epam.ggl.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OOPPage extends Page {
 
  public OOPPage(WebDriver webDriver) {
    super(webDriver);    
  }
      
  public void ClickLinkByText(String linkText){
	driver.findElement(By.linkText(linkText)).click();		  
  }  
}
