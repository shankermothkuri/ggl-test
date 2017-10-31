package com.epam.google.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.epam.google.test.pages.OOPPage;
import com.epam.google.test.pages.ObjectOrientedProgrammingPage;
import com.epam.google.test.pages.WikiPage;
//import com.epam.google.test.pages.WikiPage;

public class WikipediaTest extends JUnitTestBase {

	private WikiPage wikipage;
	private OOPPage oOPPage;
	private ObjectOrientedProgrammingPage objectOrientedProgrammingPage;

	@Before
	public void initPageObjects() {

		wikipage = PageFactory.initElements(driver, WikiPage.class);
		oOPPage = PageFactory.initElements(driver, OOPPage.class);
		objectOrientedProgrammingPage = PageFactory.initElements(driver, ObjectOrientedProgrammingPage.class);
		driver.get(baseUrl);
	}

	@Test
	public void testWikiPediaNavigatedToOOPPage() throws InterruptedException {

		wikipage.SearchString("OOP");
		wikipage.ClickResultByIndex(1);
		Assert.assertTrue(wikipage.getCurrentURL().equals("https://en.wikipedia.org/wiki/OOP"));
		oOPPage.ClickLinkByText("Object-oriented programming");
		Assert.assertTrue(oOPPage.getCurrentURL().equals("https://en.wikipedia.org/wiki/Object-oriented_programming"));
		objectOrientedProgrammingPage.scrollToBottom();
		objectOrientedProgrammingPage.ClickLinkByText("Software_engineering");
		objectOrientedProgrammingPage.ClickLinkByIndexInSoftwareEngineers(2);
	}

}
