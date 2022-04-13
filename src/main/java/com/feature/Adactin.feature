Feature: Hotel Booking Using Adactin App
Scenario: Login Into The Adactin App
Given user Launch The Adactin Application Url
When user Enter The Username IN Username Field
And user Enter The Password In Password Field
Then user Click On The Login Button And Navigates To The Search HOtel Page

Scenario: Searching The Hotel

When user  Select The Location Using The Location DropDown 
And user  Select The Hotel Using The Hotels Dropdown
And user Select The Roomtype Using The Roomtype Dropdrown
And user Choose The No Of Rooms Using The NumberOfRooms Dropdown
And user Enter The Checkin Date Using The CheckIn Date Dropdown
And user Enter The Checkout Date Using The Checkout Date Dropdown
And user Select The No Of Adults In a Room Using Adults Per Room Dropdown
And user Select The No Of Childrens Per Room Using Children Per Room Dropdown
Then user Click On the Search Button And Navigates To The Select Hotel Page

Scenario: Selecting The Hotel

When user Select The Hotel By Clicking The Radio Button Present In The Select Coloumn
Then user Click Continue Button And Navigates To Book A Hotel Page

Scenario: Book A Hotel

When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Address In Address Field
And user Enter The 16 Digit Card number in Credit Card No Field
And user Select The Card type Using Credit Card type Dropdown
And user Select The Expiry Month And Year Using Expiry Date Dropdown
And user Enter The CVV Number In CVV Number Field
Then user Click On Book NOw Button And Navigates To Booking Confirmation Page

Scenario: Booking Confirmation

Then user Check All Details And Click On Logout Button And Navigates To Home Page

Scenario: Cancel Booking

When user Enter The Username In USername Field
And user Enter The Password In Password Field
Then user Click Login Button And Navigates To Welcome Page
Then user Click On Booked Itineary and It Navigates To Booked Itenary Page
And user Select The Order Id radio Button To Cancel The Booked Rooms
Then user Click On Cancel Selected to Cancel The Booked Itinearary
Then user Click On OK In The Alert Box To Confirm The Cancellation
Then user Click On Log Out Button To Navigate To Homepage