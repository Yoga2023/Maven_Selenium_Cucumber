package com.adaction.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
public static WebDriver driver;

	@FindBy(id="my_itinerary")
	private WebElement myItinerary;

	public Booking_Confirmation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}
	
}
