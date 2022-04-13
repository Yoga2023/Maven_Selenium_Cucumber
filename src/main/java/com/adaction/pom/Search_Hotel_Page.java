package com.adaction.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement noOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement checkIndate;

	@FindBy(id = "datepick_out")
	private WebElement checkOut;

	@FindBy(id = "adult_room")
	private WebElement adultRoom;

	@FindBy(id = "Submit")
	private WebElement search;

	public Search_Hotel_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIndate() {
		return checkIndate;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSearch() {
		return search;
	}

}
