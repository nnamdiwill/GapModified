package stepDefs;

import base.GapHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GapStepDefs {

	GapHomePage ghp = new GapHomePage();
	@Given("open browser")
	public void open_browser() {
	   ghp.openUp();
	}
	
	
	@And("click on item")
	public void click_on_item() {
	   ghp.hoverOverMen();
	   ghp.getMenDropDownList();
	   ghp.clickForHoodies();
	}
	@Then("close browser")
	public void close_browser() {
	   ghp.closeBrowser();
	}

	@Given("opens the browser")
	public void opens_the_browser() {
		ghp.openUp();
	}
	
	@And("goes to girl dropdown")
	public void goes_to_girl_dropdown() {
	    
	}
	@And("select and click on jeans")
	public void select_and_click_on_jeans() {
	   
	}
	@And("select straight category")
	public void select_straight_category() {
	   
	}
	@And("select high rise mom jeans")
	public void select_high_rise_mom_jeans() {
	   
	}
	@And("select proper size")
	public void select_proper_size() {
	   
	}
	




}
