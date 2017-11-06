package com.epam.ggl.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectOrientedProgrammingPage extends Page {

	public ObjectOrientedProgrammingPage(WebDriver webDriver) {
		super(webDriver);
	}

	public void ClickLinkByText(String linkText) {
		driver.findElement(By.xpath(".//*[@id='Software_engineering']/a/ancestor::th//a[text()='show']")).click();
	}

	public void ClickLinkByIndexInSoftwareEngineers(int index) {
		List<WebElement> links = driver
				.findElements(By.xpath(".//*[@id='collapsibleTable1']/tbody/tr[6]/th/div/ancestor::tr//a[1]"));
		links.get(index).click();
	}
}
