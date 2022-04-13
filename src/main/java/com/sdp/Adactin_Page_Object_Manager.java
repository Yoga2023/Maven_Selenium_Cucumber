package com.sdp;

import org.openqa.selenium.WebDriver;

import com.adaction.pom.Book_Hotel_Page;
import com.adaction.pom.Booking_Confirmation;
import com.adaction.pom.Cancel_Booking;
import com.adaction.pom.Log_Out_Page;
import com.adaction.pom.Login_Page;
import com.adaction.pom.Search_Hotel_Page;
import com.adaction.pom.Select_Hotel_Page;

public class Adactin_Page_Object_Manager {
	public static WebDriver driver;
	
	private Login_Page lp;
	private Search_Hotel_Page shp;
	private Select_Hotel_Page shpp;
	private Book_Hotel_Page bhp;
	private Booking_Confirmation bc;
	private Cancel_Booking cb;
	private Log_Out_Page lop;
	
	public Adactin_Page_Object_Manager(WebDriver driver) {
		this.driver=driver;
	}
	public Login_Page getLp() {
		lp=new Login_Page(driver);
		return lp;
	}
	public Search_Hotel_Page getShp() {
		shp=new Search_Hotel_Page(driver);
		return shp;
	}
	public Select_Hotel_Page getShpp() {
		shpp=new Select_Hotel_Page(driver);
		return shpp;
	}
	public Book_Hotel_Page getBhp() {
		bhp=new Book_Hotel_Page(driver);
		return bhp;
	}
	public Booking_Confirmation getBc() {
		bc=new Booking_Confirmation(driver);
		return bc;
	}
	
	public Log_Out_Page getLop() {
		lop=new Log_Out_Page(driver);
		return lop;
	}
	
	

}
