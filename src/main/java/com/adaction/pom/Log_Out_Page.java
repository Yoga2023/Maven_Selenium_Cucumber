package com.adaction.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out_Page {
public static WebDriver driver;

	@FindBy(id="logout")
	private WebElement logOut;

	public Log_Out_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
