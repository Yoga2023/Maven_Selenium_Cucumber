package com.stepDefinition;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.WebDriver;

import com.baseClass.Base_Class;
import com.sdp.Adactin_Page_Object_Manager;
import com.testrun.Test_Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Adactin_Page_Object_Manager apom = new Adactin_Page_Object_Manager(driver);

	@Before
	public void before_Hooks(Scenario s) {
		String name = s.getName();
	
		System.out.println("Scenario name :" + name);
	}

	@After
	public void afetr_Hooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			screenShot("C:\\Users\\yogak\\eclipse-workspace\\MavenProject\\Screenshot\\FailedCase ");
		}
		Status status = s.getStatus();
		System.out.println("Scenario status :" + status);
	}
	
	@Given("user Launch The Adactin Application Url")
	public void user_launch_the_adactin_application_url() {
		url("https://adactinhotelapp.com/index.php");
	}
	
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
		input(apom.getLp().getEmail(), username);
	}

	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
		input(apom.getLp().getPassword(), password);
	}
	
	
	

	@Then("user Click On The Login Button And Navigates To The Search HOtel Page")
	public void user_click_on_the_login_button_and_navigates_to_the_search_h_otel_page() {
click(apom.getLp().getLogIn());
	}

	
	@When("user  Select The {string} Using The Location DropDown")
	public void user_select_the_using_the_location_drop_down(String location) {
		dropdown(apom.getShp().getLocation(), "value", location);
	}

	@When("user  Select The Hotel Using The Hotels Dropdown")
	public void user_select_the_hotel_using_the_hotels_dropdown() {
		dropdown(apom.getShp().getHotel(),"value", "Hotel Creek");
	}

	@When("user Select The Roomtype Using The Roomtype Dropdrown")
	public void user_select_the_roomtype_using_the_roomtype_dropdrown() {
		dropdown(apom.getShp().getRoomtype(), "value", "Super Deluxe");
	}

	@When("user Choose The No Of Rooms Using The NumberOfRooms Dropdown")
	public void user_choose_the_no_of_rooms_using_the_number_of_rooms_dropdown() {
		dropdown(apom.getShp().getNoOfRooms(), "value", "2");
	}

	@When("user Enter The Checkin Date Using The CheckIn Date Dropdown")
	public void user_enter_the_checkin_date_using_the_check_in_date_dropdown() {
		input(apom.getShp().getCheckIndate(), "11/04/2022");
	}

	@When("user Enter The Checkout Date Using The Checkout Date Dropdown")
	public void user_enter_the_checkout_date_using_the_checkout_date_dropdown() {
		input(apom.getShp().getCheckOut(), "12/04/2022");
	}

	@When("user Select The No Of Adults In a Room Using Adults Per Room Dropdown")
	public void user_select_the_no_of_adults_in_a_room_using_adults_per_room_dropdown() {
		dropdown(apom.getShp().getAdultRoom() ,"value", "2");
	}

	@When("user Select The No Of Childrens Per Room Using Children Per Room Dropdown")
	public void user_select_the_no_of_childrens_per_room_using_children_per_room_dropdown() {
		
	}

	@Then("user Click On the Search Button And Navigates To The Select Hotel Page")
	public void user_click_on_the_search_button_and_navigates_to_the_select_hotel_page() {
		click(apom.getShp().getSearch());
	}

	@When("user Select The Hotel By Clicking The Radio Button Present In The Select Coloumn")
	public void user_select_the_hotel_by_clicking_the_radio_button_present_in_the_select_coloumn() {
		click(apom.getShpp().getSelectHotel());
	}

	@Then("user Click Continue Button And Navigates To Book A Hotel Page")
	public void user_click_continue_button_and_navigates_to_book_a_hotel_page() {
		click(apom.getShpp().getCont());
	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
		input(apom.getBhp().getFirstName(), "YogaBabu");
	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_enter_the_lastname_in_lastname_field() {
		input(apom.getBhp().getLastName(),"Kumaravel");
	}

	@When("user Enter The Address In Address Field")
	public void user_enter_the_address_in_address_field() {
		input(apom.getBhp().getAddress(),"Chennai");
	}

	@When("user Enter The {int} Digit Card number in Credit Card No Field")
	public void user_enter_the_digit_card_number_in_credit_card_no_field(Integer int1) {
		input(apom.getBhp().getCardNumber(),"1234567897897894");
	}

	@When("user Select The Card type Using Credit Card type Dropdown")
	public void user_select_the_card_type_using_credit_card_type_dropdown() {
		dropdown(apom.getBhp().getCardType(), "value", "AMEX");
	}

	@When("user Select The Expiry Month And Year Using Expiry Date Dropdown")
	public void user_select_the_expiry_month_and_year_using_expiry_date_dropdown() {
		dropdown(apom.getBhp().getCardMonth(), "value", "8");
		dropdown(apom.getBhp().getCardYear(), "value", "2018");
	}

	@When("user Enter The CVV Number In CVV Number Field")
	public void user_enter_the_cvv_number_in_cvv_number_field() {
		input(apom.getBhp().getCardCVV(),"1234");
	}

	@Then("user Click On Book NOw Button And Navigates To Booking Confirmation Page")
	public void user_click_on_book_n_ow_button_and_navigates_to_booking_confirmation_page() {
		click(apom.getBhp().getBook());
	}

	@Then("user Check All Details And Click On Logout Button And Navigates To Home Page")
	public void user_check_all_details_and_click_on_logout_button_and_navigates_to_home_page() {
		click(apom.getLop().getLogOut());
	}

}
