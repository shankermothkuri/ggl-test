package com.epam.ggl.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class WikiPage extends Page {

	@FindBy(how = How.ID, using = "searchInput")
	@CacheLookup
	public WebElement search;

	public WikiPage(WebDriver webDriver) {
		super(webDriver);

	}

	public void SearchString(String searchString) {
		search.sendKeys(searchString);

	}

	public void ClickResultByLinkText(String linkText) {

	}

	public void ClickResultByIndex(int index) {
		driver.findElement(By.xpath(".//*[@id='typeahead-suggestions']/div/a[" + index + "]")).click();
		
	}

}
