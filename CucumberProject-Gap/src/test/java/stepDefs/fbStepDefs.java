package stepDefs;

import base.FBHome;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class fbStepDefs {

	
	FBHome fbh = new FBHome();
	
	@Given("^open Facebook page$")
	public void open_facebook_page() {
	    fbh.gotoPage();
	}
	
	@And("^Login and out of facebook$")
	public void login_and_out_of_facebook() {
	   fbh.inAndOut();
	}
	
	@Then("^close facebook page$")
	public void close_facebook_page() {
	    fbh.closingFaceBook();
		
	}
}
