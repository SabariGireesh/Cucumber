package stepdefinitions;


import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IRCTCRegistrationFlow {
	
	@Given("User has to launch https:\\/\\/www.irctc.co.in url in the Chrome browser.")
	public void user_has_to_launch_https_www_irctc_co_in_url_in_the_chrome_browser() {
	    
				
	}
	

	@When("user click on register button in the home page")
	public void user_click_on_register_button_in_the_home_page() {

	}
	@Then("the irctc registration page should open")
	public void the_irctc_registration_page_should_open() {
	    
	}
	@When("user enter the Basic information")
	public void user_enter_the_basic_information() {
	    
	}
	@When("user enters the address details")
	public void user_enters_the_address_details() {
	    
	}
	@When("submit the regitration form")
	public void submit_the_regitration_form() {
	    
	}
	@Then("user should ba able to see a success message.")
	public void user_should_ba_able_to_see_a_success_message() {
	    
	}

	@When("User Verified Country Dropdown values")
	public void user_verified_country_dropdown_values(DataTable dataTable) {
	   
		/*
		 * List<List<String>> obj = dataTable.asLists(); for(int i =0; i<obj.size();i++)
		 * { for(int j =0; j<obj.get(i).size();j++) {
		 * System.out.println(obj.get(i).get(j)); } }
		 */
		
		System.out.println(dataTable.asMaps());
	  
	}
	@When("user enter the invalid Basic information")
	public void user_enter_the_invalid_basic_information() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("the error messgaes should display")
	public void the_error_messgaes_should_display() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("user enters the invalid address details")
	public void user_enters_the_invalid_address_details() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("user should ba able to see a error message.")
	public void user_should_ba_able_to_see_a_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("user launches {string} browser")
	public void user_launches_browser(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println(string);
		System.out.println("Iteration Completed");
		
	}
	
	@Then("Loads the url as {string}")
	public void url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 
		System.out.println(string);
		System.out.println("url loading Completed");
		
	}



}
