package com.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adaction.pom.Book_Hotel_Page;
import com.adaction.pom.Booking_Confirmation;
import com.adaction.pom.Log_Out_Page;
import com.adaction.pom.Login_Page;
import com.adaction.pom.Search_Hotel_Page;
import com.adaction.pom.Select_Hotel_Page;
import com.baseClass.Base_Class;
import com.sdp.Adactin_Page_Object_Manager;

public class Adactin_Maven extends Base_Class {
	public static WebDriver driver = Base_Class.browser("chrome");
	/*
	 * public static Login_Page lp = new Login_Page(driver); public static
	 * Search_Hotel_Page shp = new Search_Hotel_Page(driver); public static
	 * Select_Hotel_Page shpp = new Select_Hotel_Page(driver); public static
	 * Book_Hotel_Page bhp = new Book_Hotel_Page(driver); public static
	 * Booking_Confirmation bc = new Booking_Confirmation(driver); public static
	 * Log_Out_Page lop = new Log_Out_Page(driver);
	 */

	public static Adactin_Page_Object_Manager apom=new Adactin_Page_Object_Manager(driver);
	public static void main(String [] args) {
		
		url("https://adactinhotelapp.com/index.php");
		input(apom.getLp().getEmail(), "yoga2023");
		input(apom.getLp().getPassword(), "Yog@2023");
		click(apom.getLp().getLogIn());
		dropdown(apom.getShp().getLocation(), "value", "Sydney");
		dropdown(apom.getShp().getHotel(),"value", "Hotel Creek");
		dropdown(apom.getShp().getRoomtype(), "value", "Super Deluxe");
		dropdown(apom.getShp().getNoOfRooms(), "value", "2");
		input(apom.getShp().getCheckIndate(), "09/04/2022");
		input(apom.getShp().getCheckOut(), "10/04/2022");
		dropdown(apom.getShp().getAdultRoom() ,"value", "2");
		click(apom.getShp().getSearch());
		click(apom.getShpp().getSelectHotel());
		click(apom.getShpp().getCont());
		input(apom.getBhp().getFirstName(), "YogaBabu");
		input(apom.getBhp().getLastName(),"Kumaravel");
		input(apom.getBhp().getAddress(),"Chennai");
		input(apom.getBhp().getCardNumber(),"1234567897897894");
		dropdown(apom.getBhp().getCardType(), "value", "AMEX");
		dropdown(apom.getBhp().getCardMonth(), "value", "8");
		dropdown(apom.getBhp().getCardYear(), "value", "2018");
		input(apom.getBhp().getCardCVV(),"1234");
		click(apom.getBhp().getBook());
		click(apom.getLop().getLogOut());
		
	}
	
}
